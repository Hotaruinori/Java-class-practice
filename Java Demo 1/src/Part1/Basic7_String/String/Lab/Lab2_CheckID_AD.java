//Lab2: 身分證字號檢查
// 03 王鈞弘 2025/04/15
package Part1.Basic7_String.String.Lab;
import java.io.*;

public class Lab2_CheckID_AD
{
   public static void main(String[] args) throws IOException
   {
    // c1:首字字元的索引值, c2:性別字元的索引值, cn:後續字元的索引值
    // total:檢查總長度是否正確
    // id:輸入的字串, chkid:檢查字串

    int c1,c2,total;
    String id;
    String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO";  // 檢查字串，重點
    BufferedReader keyin = new BufferedReader(
    new InputStreamReader(System.in));
                                
    c1=c2=total=0;         
    System.out.print("請輸入身分證字號:");
    id = keyin.readLine();

    if(id.length()!=10){
        System.err.println("長度不正確!");
        System.exit(0);
    }
    
    id = id.toUpperCase();
    c1 = chkid.indexOf(id.charAt(0));
    c2 = chkid.indexOf(id.charAt(1));
        
    if(c1<10){
        System.err.println("首字字元不正確!");
        System.exit(0);
    }
    
    if(c2<1 || c2>2){
        System.err.println("性別欄不正確!");
        System.exit(0);
    }
    
    // 檢查第3~第10個字元 
    for (int i=2; i<=9; i++){
        if (chkid.indexOf(id.charAt(i))<0 || chkid.indexOf(id.charAt(i))>9 ) {
            System.err.println("字元不正確!");
            System.exit(0);
        }
    }
    //total=首字字元的加權值
    total = c1/10 + (c1%10) * 9;
    
    //total=total+其他字元的加權值
    for (int i=1, y=8; i<=8; i++, y--){
        total += (chkid.indexOf(id.charAt(i))) * y;
    }
    total += (chkid.indexOf(id.charAt(9)));
    // System.out.println("總和值:" + total);
    
    if(total % 10 == 0)
        System.out.println("是身分證字號");
    else
        System.out.println("不是身分證字號");
   }       
}