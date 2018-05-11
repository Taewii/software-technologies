function solve(num) {
	let result = '';

	for (var i = 1; i <= Number(num); i++) {	
		let current = '' + i;	
		if (current == [...current].reverse().join('')) {
			console.log(i);
		}
	}
}

//solve(750);