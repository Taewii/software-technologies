function solve(arr) {
    let objs = arr.map(JSON.parse);

    for (let i = 0; i < objs.length; i++) {
        console.log(`Name: ${objs[i].name}`);
        console.log(`Age: ${objs[i].age}`);
        console.log(`Date: ${objs[i].date}`);

    }
}

solve([
    '{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);