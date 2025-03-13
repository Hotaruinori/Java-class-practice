import java.time.*;
public class ch11_12 {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.of(2020, 2, 10, 11, 30);
		System.out.println("新的日期時間 : " + datetime);
		datetime = LocalDateTime.of(2020, 2, 10, 11, 40, 30);
		System.out.println("新的日期時間 : " + datetime);
		datetime = LocalDateTime.of(2020, 2, 10, 11, 50, 30, 300000000);
		System.out.println("新的日期時間 : " + datetime);
	}
}

