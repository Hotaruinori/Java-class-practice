//Lab1: 身分證字號檢查
// 03 王鈞弘 2025/04/15
package Part1.Basic7_String.String.Lab;
import java.util.*;

public class Lab1_CheckID
{
  public static void main(String[] args){
    char ch;
    int total=0, n=0;
    
    Scanner keyin = new Scanner(System.in);
    System.out.print("請輸入身分證字號: ");
    String id = keyin.nextLine();
    keyin.close();
    /* 檢查身分證字號長度 */
    if(id.length() != 10){
        System.err.println("長度不正確");
        System.exit(0);
    }

    /* 檢查首字字元 */ 
    id=id.toUpperCase();
    ch=id.charAt(0);      
    switch(ch){
      case 'A':
        n=10;
        break;
      case 'B':
        n=11;
        break;
      case 'C':
        n=12;
        break;
      case 'D':
        n=13;
        break;
      case 'E':
        n=14;
        break;
      case 'F':
        n=15;
        break;
      case 'G':
        n=16;
        break;
      case 'H':
        n=17;
        break;
      case 'I':
        n=34;
        break;
      case 'J':
        n=18;
        break;
      case 'K':
        n=19;
        break;
      case 'L':
        n=20;
        break;
      case 'M':
        n=21;
        break;
      case 'N':
        n=22;
        break;
      case 'O':
        n=35;
        break;
      case 'P':
        n=23;
        break;
      case 'Q':
        n=24;
        break;
      case 'R':
        n=25;
        break;
      case 'S':
        n=26;
        break;
      case 'T':
        n=27;
        break;
      case 'U':
        n=28;
        break;
      case 'V':
        n=29;
        break;
      case 'W':
        n=32;
        break;
      case 'X':
        n=30;
        break;
      case 'Y':
        n=31;
        break;
      case 'Z':
        n=33;
        break;
      default:
        System.err.println("首字字元不正確");
        System.exit(0);
    }
        
    // 檢查身分證字號性別欄
    ch = id.charAt(1);
    if (ch !='1' && ch !='2' ){
        System.err.println("性別欄不正確");
        System.exit(0);
    }
    // 檢查第3~第10個字元    
    for(int i=2;i<=9;i++){
        if(!Character.isDigit(id.charAt(i))){
            System.err.println("第"+(i+1)+"個字元不正確");
            System.exit(0);
        }
    }
    //total=首字字元的加權值 
    total = n/10 + (n%10) * 9; 

    //total=total+其他字元的加權值(A 12345678 9)
    for(int i=1, y= 8 ; i<=8 ; i++, y--){
        total += (id.charAt(i)-'0') * y ;
        // total += Integer.parseInt(id.substring(i, i+1)) * y ; 另外寫法
    }
    total += (id.charAt(9)-'0');
    // total += id.getNumericValue(id.charAt(9));  另外寫法


    //檢查總和的餘數
    // System.out.println("總和值:" + total);
    if(total % 10 == 0)
        System.out.println("是身分證字號");
    else
        System.out.println("不是身分證字號");
  }
}