function solve(arr) {

    let controlKey = arr[arr.length - 1];
    let result = [];

    for (let i = 0; i < arr.length - 1; i++) {
        let key = arr[i].split(' ')[0];
        let value = arr[i].split(' ')[1];

        if (key in result) {
            result[key] = value;
        } else {
            result[key] = value;
        }
    }

    if (controlKey in result) {
        console.log(result[controlKey]);
    } else {
        console.log('None')
    }
}

// solve([
//     'key value',
//     'key eulav',
//     'test tset',
//     'key',
// ]);

// solve([
//     '3 test',
//     '3 test1',
//     '4 test2',
//     '4 test3',
//     '4 test5',
//     '4',
// ]);

// solve([
//     '3 bla',
//     '3 alb',
//     '2',
// ]);