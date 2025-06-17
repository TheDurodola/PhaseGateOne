
for(let index= 1; index < 11; index++){
	if(index%4==0){
		let multiple = index;
		for(let count = 0 ; count < 5; count++){
			console.log(`${multiple}`);
		multiple = multiple * index;
		}
	}
}
