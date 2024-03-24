function converToINR(){
	// read the dollar in variable
	const dollarinput=document.getElementById("dollarinput").value
	// conver dollar to INR
	const INR=(parseFloat(dollarinput*82.90))
	// set the output INR
	document.getElementById("INRoutput").value=INR.toFixed(3)
}