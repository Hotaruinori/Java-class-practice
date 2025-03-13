import java.util.Random;
public class ch10_13 {
	public static void main(String[] args) {
		Random ran = new Random();
		for ( int i = 0; i < 10; i++ ) {
			System.out.printf("%d \t", ran.nextInt(100));	// 產生0-99隨機數
			System.out.printf("%d \n", ran.nextInt());		// 產生int值範圍隨機數
		}
	}
}

