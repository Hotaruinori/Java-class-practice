public class ex6_10 {
	public static void main(String[] args) {
		double e = 1;
		double data = 1;

		for (int i = 1; i <= 100; i++) {
			data = data / i;
			e += data;

			if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50
				|| i == 60 || i == 70 || i == 80 || i == 90 || i == 100)
				System.out.printf("當 i = %3d, e = %15.14f%n", i, e);
		}
	}
}

