function solve(arr) {

    let result = [];

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 'Stop') {
            break;
         } else {
             result.push(arr[i]);
         }   
    }

    console.log(result.join('\r\n'));  
}

// solve([
//     '3',
//     '6',
//     '5',
//     '4',
//     'Stop',
//     '10',
//     '12',
// ]);

// solve([
//     'Line 1',
//     'Line 2',
//     'Line 3',
//     'Stop',
// ]);