import java.time.*;
public class ch11_5 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("現在日期 : " + today);
		System.out.println("    年分 : " + today.getYear());
		System.out.println("英文月份 : " + today.getMonth());
		System.out.println("    月份 : " + today.getMonthValue());
		System.out.println("英文星期 : " + today.getDayOfWeek());
		System.out.println("當月日期 : " + today.getDayOfMonth());
		System.out.println("當年日期 : " + today.getDayOfYear());
	}
}

