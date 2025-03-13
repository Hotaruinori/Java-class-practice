import java.io.*;
class MyThrows {									// MyThrows類別
	void myMethod(int n) throws IOException, ClassNotFoundException {
		if (n == 1)
			throw new IOException("IOException發生了");
		else
			throw new ClassNotFoundException("ClassNotFoundException發生了");
	}
}
public class ch20_21 {
	public static void main(String[] args) {	
		for ( int i = 1; i <= 2; i++ ) {
			try {
				MyThrows obj = new MyThrows();
				obj.myMethod(i);					// 可能發生異常的敘述
			}
			catch(IOException e) {					// IOException異常
				System.out.println("IOException : " + e);
			}
			catch(ClassNotFoundException e) {		// ClassNotFoundException異常
				System.out.println("ClassNotFoundException : " + e);
			}
		}
	}
}

