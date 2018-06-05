const Sequeilize = require('sequelize');

module.exports = function(sequelize) {
    const Article = sequelize.define('Article', {
        title: {
            type: Sequeilize.STRING,
            allowNull: false,
            required: true
        },
        content: {
            type: Sequeilize.TEXT,
            allowNull: false,
            required: true
        },
        date: {
            type: Sequeilize.DATE,
            allowNull: false,
            required: true,
            defaultValue: Sequeilize.NOW,
        },
        
    }, {
        timestamps: false
    });

    Article.associate = function (models) {
        Article.belongsTo(models.User, {
            foreignKey: 'authorId',
            targetKey: 'id'
        });
    };

    return Article;
}