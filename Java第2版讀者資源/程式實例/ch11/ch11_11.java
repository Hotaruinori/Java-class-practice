import java.time.*;
public class ch11_11 {
	public static void main(String[] args) {
		int year, month, monthValue, dayofWeek, dayofMonth, dayofYear;
		LocalDateTime today = LocalDateTime.now();
		System.out.println("現在日期 : " + today);
		System.out.println("    年份 : " + today.getYear());
		System.out.println("英文月份 : " + today.getMonth());
		System.out.println("    月份 : " + today.getMonthValue());
		System.out.println("英文星期 : " + today.getDayOfWeek());
		System.out.println("當月日期 : " + today.getDayOfMonth());
		System.out.println("當年日期 : " + today.getDayOfYear());
		System.out.println("      時 : " + today.getHour());
		System.out.println("      分 : " + today.getMinute());
		System.out.println("      秒 : " + today.getSecond());
		System.out.println("    奈秒 : " + today.getNano());
	}
}

