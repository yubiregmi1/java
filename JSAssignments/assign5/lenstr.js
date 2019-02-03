/**
 * 
 */

function calculateLength()
{
	var ipString = document.getElementById("ip_len").value;
	var op;
	
	for (i=0;i<ipString.length;i++)
	{
		//document.getElementById("res").innerHTML = document.write(ipString.charCodeAt(i)+"<br>");
		op += "<ul>"+ipString.charCodeAt(i)+"</ul>";
	}
	document.getElementById("res").innerHTML = op;
}