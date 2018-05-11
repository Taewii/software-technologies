function solve(nums) {
    let first = Number(nums[0]);
    let second = Number(nums[1]);

    if (second >= first) {
        console.log(first * second);
    } else {
        console.log(first / second);
    }
}

// solve([
//     '13',
//     '13',
// ])