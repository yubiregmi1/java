/**
 * 
 */

var currentDate;

function calculateDate()
{
	date = new Date();
	y = date.getFullYear();
	m = date.getMonth()+1;
	d = date.getDate();
	
	currentDate = y+"-"+m+"-"+d;
	document.getElementById("viewdate").innerHTML = currentDate;
	
}

function displayDate()
{
	document.getElementById("viewdate").innerHTML = currentDate;
}