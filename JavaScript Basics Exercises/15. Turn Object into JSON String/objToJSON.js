function solve(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i++) {
        let objProps = arr[i].split(" -> ");
        let key = objProps[0];
        let value = objProps[1];

        if (key === "age" || key === "grade") {
            value = Number(value);
        }
        obj[key] = value;
    }

    let json = JSON.stringify(obj);
    console.log(json);
}

solve([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia',
]);