/**
 * 
 */
var result=0;


function addNumbers()
{
	num1 = parseFloat(document.getElementById("num1").value);
	num2 = parseFloat(document.getElementById("num2").value);	
	if (isNaN(num1 || num2))
	{
		alert("Either num1 ir nim2 is not a number. Please enter number.");
	}
	else
	{
		document.getElementById("res").value = num1+num2;
	}
	
}