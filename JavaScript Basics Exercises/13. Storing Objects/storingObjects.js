function solve(arr) {

    let students = [];

    for (let i = 0; i < arr.length; i++) {
        let name = arr[i].split(' -> ')[0];
        let age = arr[i].split(' -> ')[1];
        let grade = arr[i].split(' -> ')[2];
        
        let student = {name:name, age:age, grade:grade};
        students.push(student);
    }

    for (let j = 0; j < students.length; j++) {
        console.log(`Name: ${students[j].name}`)
        console.log(`Age: ${students[j].age}`)
        console.log(`Grade: ${students[j].grade}`)
    }
}

// solve([
//     'Pesho -> 13 -> 6.00',
//     'Ivan -> 12 -> 5.57',
//     'Toni -> 13 -> 4.90',
// ]);