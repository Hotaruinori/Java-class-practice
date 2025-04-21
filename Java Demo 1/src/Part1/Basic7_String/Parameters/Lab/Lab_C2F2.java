package Part1.Basic7_String.Parameters.Lab;
import java.util.Scanner;

//Transfer，#TODO可以支援複數個參數
class Transfer{
	float f;	
	float getC(float c)	{
		f = ((9 * c) / 5) + 32;	//攝氏轉成華氏	
		return f;	
	}
}

//Celsius2Fahrenheit
public class Lab_C2F2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("請輸入攝氏溫度");
		// 處理複數個輸入值
		while (flag) {
			if (!sc.hasNextFloat()) {
				flag = false;
			}
			float c = sc.nextFloat();
			Transfer t = new Transfer();
			float f = t.getC(c);
			System.out.println("華氏溫度為:" + f);

		}
		sc.close();

	}
}

/* java Lab_C2F 100
   java Lab_C2F 100 200
   java Lab_C2F 100 200 300
   :
   :
   :
*/
   