function solve(arr) {

    let result = [];

    for (let i = 0; i < arr.length; i++) {
       let command = arr[i].split(' ')[0];
       let numOrIndex = Number(arr[i].split(' ')[1]);

       if (command === 'add') {
           result.push(numOrIndex);
       } else {
           result.splice(numOrIndex, 1);
       }
    }

    console.log(result.join('\r\n'));
    
}

// solve([
//     'add 3',
//     'add 5',
//     'add 7',
// ]);

// solve([
//     'add 3',
//     'add 5',
//     'remove 1',
//     'add 2',
// ]);

// solve([
//     'add 3',
//     'add 5',
//     'remove 2',
//     'remove 0',
//     'add 7',
// ]);