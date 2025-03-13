import java.io.IOException;
public class ch22_15 {	
    public static void main(String args[]){
		int ch;
		System.out.println("輸出一般訊息 "); 	// System.out
		System.err.println("輸出ERR訊息  ");	// System.err
		try {
			System.out.println("請輸入一個字元 "); 	
			ch = System.in.read();				// System.in, 返回字元的碼值
			System.out.println(ch);				// 列印碼值
		}										
		catch (IOException e) {
			System.out.println(e);						
		}	
	}
}

