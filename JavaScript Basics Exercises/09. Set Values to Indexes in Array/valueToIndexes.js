function solve(arr) {
    
    let n = Number(arr[0]);
    let result = [];
    (result = []).length = n;
    result.fill(0);

    for (let i = 1; i < arr.length; i++) {
        
        let index = arr[i].split(" - ")[0];
        let value = arr[i].split(" - ")[1];
        
        result.splice(index, 1, value);
    }
    
    console.log(result.join('\r\n'));
}

// solve([
//     '5',
//     '0 - 3',
//     '3 - -1',
//     '4 - 2',
// ])