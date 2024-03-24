function Reverse(){
		//read the String in variable
	let str=document.getElementById('stringinput').value;
		//convert the string to reverse
		let rev=""
		for(let i=0;i<str.length;i++){
			rev=str[i]+rev
		}
		//set the output
		document.getElementById('reverseoutput').value=rev
}