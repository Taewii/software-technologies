function solve(nums) {
    let negativeNums = nums.map(Number).filter(x => x < 0);
    let hasZero = false;

    nums.forEach(element => {
        element = Number(element);
        if (element === 0) {
            console.log('Positive');
            hasZero = true;
        }
    });

    if (hasZero === false) {
        if (negativeNums.length % 2 == 1) {
            console.log('Negative');
        } else {
            console.log('Positive');
        }
    }

}

// solve([
//     '2',
//     '3',
//     '-1'
// ])