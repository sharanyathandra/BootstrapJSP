function createXMLHttpRequest(){
	  // See http://en.wikipedia.org/wiki/XMLHttpRequest
	  // Provide the XMLHttpRequest class for IE 5.x-6.x:
	  if( typeof XMLHttpRequest == "undefined" ) XMLHttpRequest = function() {
	    try { return new ActiveXObject("Msxml2.XMLHTTP.6.0") } catch(e) {}
	    try { return new ActiveXObject("Msxml2.XMLHTTP.3.0") } catch(e) {}
	    try { return new ActiveXObject("Msxml2.XMLHTTP") } catch(e) {}
	    try { return new ActiveXObject("Microsoft.XMLHTTP") } catch(e) {}
	    throw new Error( "This browser does not support XMLHttpRequest." )
	  };
	  return new XMLHttpRequest();
	}
function call(){
	var AJAX = createXMLHttpRequest();

	 var email=document.getElementById("inputEmail3").value;
	 var password=document.getElementById("inputPassword3").value;
	 
	 
	 
	  AJAX.open("GET", "login.jsp?inputEmail3=" + email + "&inputPassword3=" + password);
	  AJAX.send("");
	  AJAX.onreadystatechange = handler;
	  alert("Welcome to NASA");
	  
	  function handler(){
		  if(AJAX.readyState == 4 && AJAX.status == 200){
		   console.log(AJAX.responseText);
		   var divTag = document.getElementById("");
		   divTag.innerHTML = AJAX.responseText;
		   
		  }
	  }
}