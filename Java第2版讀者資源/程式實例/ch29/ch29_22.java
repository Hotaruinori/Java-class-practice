import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_22 {	
	static JFrame jfrm = new JFrame("ch29_22");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JTextField tf1 = new JTextField("歡迎");	// 建立文字方塊
	static JTextField tf2 = new JTextField("深石");	// 建立文字方塊
	public static void main(String[] args) {
		ct.setLayout(null);							// 不設版面配置	
		tf1.setBounds(50,30,100,20);
		tf2.setBounds(50,80,100,20);
// 將元件放入內容窗格		
		ct.add(tf1);								
		ct.add(tf2);
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(260,200);						// 寬260, 高200
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

