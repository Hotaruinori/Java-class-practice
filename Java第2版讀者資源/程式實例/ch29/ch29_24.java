import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_24 {	
	static JFrame jfrm = new JFrame("ch29_24");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JTextArea ta = new JTextArea("歡迎光臨");// 建立文字區
	public static void main(String[] args) {
		ct.setLayout(null);							// 不設版面配置	
		ta.setBounds(20,30,240,160);
// 將元件放入內容窗格		
		ct.add(ta);								
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(300,260);						// 寬300, 高260
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

