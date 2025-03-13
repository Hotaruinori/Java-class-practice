import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_26 {	
	static JFrame jfrm = new JFrame("ch29_26");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JPasswordField pwd = new JPasswordField();// 建立文字區
	static Label lab = new Label("Password : ");
	public static void main(String[] args) {
		ct.setLayout(null);							// 不設版面配置	
		lab.setBounds(20,50,60,20);					// 密碼欄左邊的標籤
		pwd.setBounds(85,50,100,20);				// 密碼欄
// 將元件放入內容窗格		
		ct.add(lab);
		ct.add(pwd);
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(240,160);						// 寬240, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

