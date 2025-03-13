import javax.swing.*;						// 匯入類別庫
public class ch29_1 {	
	static JFrame jfrm = new JFrame("ch29_1");
	public static void main(String[] args) {
		jfrm.setSize(200, 160);				// 寬200, 高160
// setDefaultCloseOperation()可以讓使用者按關閉紐時結束程式
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);				// 顯示視窗
	}
}

