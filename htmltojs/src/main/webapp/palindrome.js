function number(){
	//read  the number in variable
	var num=document.getElementById('numberinput').value
	//check number is palindrome or not
    var b="";
	
	for(i=num.length-1;i>=0;i--)
	{
		b=b+num[i];
	}
	
		if(b===num)
		{
			document.getElementById('numberoutput').value=b+"palindrome"
			}
		
		else
		{
			document.getElementById('numberoutput').value=b+"not a palindrome";
		}
	
	
}