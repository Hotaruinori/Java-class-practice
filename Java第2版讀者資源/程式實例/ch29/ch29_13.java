import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_13 {	
	static JFrame jfrm = new JFrame("ch29_13");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JRadioButton jrb1 = new JRadioButton("男性",true); // 定義選項鈕
	static JRadioButton jcb2 = new JRadioButton("女性");	  // 定義選項鈕	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置				
// 將元件放入內容窗格		
		ct.add(jrb1);								// 選項鈕
		ct.add(jcb2);								// 選項鈕
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(200, 120);						// 寬200, 高120
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

