//Lab2: 身分證字號檢查
package Part1.Basic7_String.String.Lab;
import java.io.*;

public class Lab2_CheckID_AD
{
   public static void main(String[] args) throws IOException
   {
	  // c1:嚙踝蕭嚙緝嚙緝嚙踝蕭嚙踝蕭嚙踝蕭嚙豬哨蕭, c2:嚙褊別嚙緝嚙踝蕭嚙踝蕭嚙踝蕭嚙豬哨蕭, cn:嚙踝蕭L嚙緝嚙踝蕭嚙踝蕭嚙踝蕭嚙豬哨蕭
      // total:嚙窯嚙稼嚙緞嚙踝蕭

      int c1,c2,total;
      String id;
      String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
      BufferedReader keyin = new BufferedReader(
                                 new InputStreamReader(System.in));
                                 
      c1=c2=total=0;         
      System.out.print("嚙請選蕭J嚙踝蕭嚙踝蕭嚙課字嚙踝蕭:");
      id = keyin.readLine();

      if(id.length()!=10)
      {
          System.err.println("嚙踝蕭嚙論歹蕭嚙踝蕭嚙確!");
	      System.exit(0);
   	  }
   	  
      id = id.toUpperCase();
      c1 = chkid.indexOf(id.charAt(0));
      c2 = chkid.indexOf(id.charAt(1));
           
      if(c1<10)
      {
          System.err.println("嚙踝蕭嚙緝嚙緝嚙踝蕭嚙踝蕭嚙踝蕭嚙確!");
          System.exit(0);
      }
      
      if(c2<1 || c2>2)
      {
          System.err.println("嚙褊別嚙賣不嚙踝蕭嚙確!");
          System.exit(0);
      }
      
      //嚙誼查嚙踝蕭3~嚙踝蕭10嚙諉字嚙踝蕭 
         

      
    //   total = 
      //嚙踝蕭嚙緝嚙緝嚙踝蕭嚙踝蕭嚙稼嚙緞嚙踝蕭
	  
      //total=total+嚙踝蕭L嚙緝嚙踝蕭嚙踝蕭嚙稼嚙緞嚙踝蕭
      
     
          
      
      if(total%10 != 0)
         System.out.println("嚙踝蕭嚙瞌嚙踝蕭嚙踝蕭嚙課字嚙踝蕭");
      else
         System.out.println("嚙碼嚙緲嚙踝蕭嚙踝蕭嚙踝蕭嚙課字嚙踝蕭");
   }       
}