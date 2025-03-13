public class ch4_23 {
	public static void main(String[] args) {
		byte i;
		i = 0B01111111;
		System.out.println("10進位輸出 : " + ~i);
		i = 0b00000001;
		System.out.println("10進位輸出 : " + ~i);
		i = 0b00000000;
		System.out.println("10進位輸出 : " + ~i);
		i = (byte)0b11111111;
		System.out.println("10進位輸出 : " + ~i);
		i = (byte)0b10000001;
		System.out.println("10進位輸出 : " + ~i);
		i = (byte)0b10000000;
		System.out.println("10進位輸出 : " + ~i);
	}
}

