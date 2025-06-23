var xmlHTTP;
var str;

function check()
{  
    var select_op=document.getElementById("select_op").value;

    if(window.ActiveXObject)
    {
        xmlHTTP=new ActiveXObject("Microsoft.XMLHTTP");
    }
    else if(window.XMLHttpRequest)
    {
        xmlHTTP=new XMLHttpRequest();
    }
    
    xmlHTTP.open("GET","http://localhost:8080/Test_Ajax/doAjax?select_op="+select_op,true);
    
    xmlHTTP.onreadystatechange=function check_status()
    {
        if(xmlHTTP.readyState == 4)
        {
            if(xmlHTTP.status == 200)
            {
                str=xmlHTTP.responseText;
                document.getElementById("message").innerHTML="<h1 style='color:blue'>"+str+"</h1>";
            }
        }
    }
    xmlHTTP.send();
}