import java.time.*;
public class ch11_9 {
	public static void main(String[] args) {
		LocalTime timenow = LocalTime.of(11, 30);
		System.out.println("新的時間 : " + timenow);
		timenow = LocalTime.of(11, 40, 30);
		System.out.println("新的時間 : " + timenow);
		timenow = LocalTime.of(11, 50, 30, 300000000);
		System.out.println("新的時間 : " + timenow);
	}
}

