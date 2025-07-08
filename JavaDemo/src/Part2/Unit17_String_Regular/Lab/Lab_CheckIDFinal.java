package Part2.Unit17_String_Regular.Lab;
import java.util.Scanner;

public class Lab_CheckIDFinal
{
	public static void main(String[] args) {
       	int total=0,n1=0;
       	String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
       	
        Scanner keyin = new Scanner(System.in);
	   	
	   	System.out.print("請輸入身分證字號:");
	   	String s = keyin.nextLine();
        keyin.close();
	   	s=s.toUpperCase();
	   	
       	//以正則表示式檢查字串            
		if(s.matches("^[A-Z][12][0-9]{8}$") == false ) 
	    {
       		System.err.println("身分證字號格式有誤");
         	System.exit(0);
       	}
    
        //首字字元的加權值
        n1=chkid.indexOf(s.charAt(0));
        total=n1/10+(n1%10)*9; 
      
        //total=total+其他字元的加權值
        for(int x=1 ;x<=8; x++)
        {
            total+=chkid.indexOf(s.charAt(x))*(9-x);
        }      
        
        total+=chkid.indexOf(s.charAt(9));
      
        if(total % 10 == 0)
            System.out.println("是身分證字號");
        else
            System.out.println("不是身分證字號");
    }
}