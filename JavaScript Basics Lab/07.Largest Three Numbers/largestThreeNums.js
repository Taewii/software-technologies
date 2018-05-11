function solve(arr) {
    let nums = arr.map(Number);

    nums.sort((a, b) => b - a);


        for (let i = 0; i < 3; i++) {
            if (nums[i] == undefined) {
                break;
            }
            console.log(nums[i]);
        }   
}
// solve([
//     '10',
//     '30',
//     '15',
//     '20',
//     '50',
//     '5',
// ]);
solve([
    '20',
    '30',
]);

