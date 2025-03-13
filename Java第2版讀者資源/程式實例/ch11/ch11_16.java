import java.time.*;
public class ch11_16 {
	public static void main(String[] args) {
		Period period = Period.between( LocalDate.of(2020, 5, 1),
										LocalDate.of(2022, 6, 5));
		System.out.println("年 : " + period.getYears());
		System.out.println("月 : " + period.getMonths());
		System.out.println("日 : " + period.getDays());
	}
}

