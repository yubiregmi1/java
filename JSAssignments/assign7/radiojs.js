/**
 * 
 */

function checkRadio()
{
	var radios = document.getElementsByName("rad");
	
	for(i=0;i<radios.length;i++)
	{
		 radios[i].onclick = function(){
	            document.getElementById('op').innerText = this.value;
	        }
	}
}