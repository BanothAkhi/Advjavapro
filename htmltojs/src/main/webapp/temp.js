function convertToCelsius(){
	// read the dollar in variable
	const fahrenheitinput=document.getElementById("fahrenheitinput").value
	// convertS fahrenheit to celsius
	const celsius=(parseFloat(fahrenheitinput-32)*5/9)
	// set the output celsius
	document.getElementById("celsiusoutput").value=celsius.toFixed(3)
}