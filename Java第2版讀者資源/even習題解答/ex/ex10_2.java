import java.util.Random;
public class ex10_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] dice = new int[10];
		
		for ( int i = 0; i < 10; i++ ) {
			dice[i] = rand.nextInt(6) + 1;
			System.out.printf("%d ", dice[i]);		// 列印骰子隨機數
		}
	}
}

