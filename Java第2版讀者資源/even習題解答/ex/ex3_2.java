public class ex3_2 {
	public static void main(String[] args) {
		int hourly_salary = 150;							// 設定時薪
		int monthly_fee = 10000;							// 設定每月花費
		int annual_salary, annual_fee, annual_savings;								
																
		annual_salary = hourly_salary * 8 * 300;			// 計算年薪								
		annual_fee = monthly_fee * 12;						// 計算每年花費						
		annual_savings = annual_salary - annual_fee;		// 計算每年儲存金額
		System.out.println("一年可以儲存 : " + annual_savings);
	}
}


