package Part2.Unit17_String_Regular.Split;
public class SpecialCharSplit 
{
    public static void main(String[] args) 
    {
    	String names="Lily cat Lulu cat Nana";
    	
        for(String str : names.split("\bcat"))  //跳脫字元  
        {
            System.out.println(str.trim() + " 跳脫字元");
        }
        System.out.println();
        
        
        for(String str : names.split("\\bcat"))  //正則字元  
        {
            System.out.println(str.trim() + " 正則字元");
        }
        System.out.println();
        
        String names2="Lily\tcat\nLulu\rcat\fNana";
        for(String str : names2.split("\\s"))  //跳脫字元   
        {
            System.out.println(str + " 跳脫字元");
        } 
        System.out.println();
        
        String names3="Lily.cat.Lulu.cat.Nana";
        for(String str : names3.split("\\."))  //特殊字元   
        {
            System.out.println(str + " 特殊字元 ");
        }         
               
    }
}


/*
 *java中的特殊字元
.
$
^
{
[
(
|
)
*
+
?
\

*/
