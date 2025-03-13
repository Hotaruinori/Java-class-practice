import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_11 {	
	static JFrame jfrm = new JFrame("ch29_11");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JCheckBox jcb1 = new JCheckBox("Travel",true); // 定義核取方塊
	static JCheckBox jcb2 = new JCheckBox();		// 定義核取方塊	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置		
// 設定核取方塊
		jcb2.setText("Reading");					// 設定核取方塊內容
		jcb2.setSelected(true);						// 勾選核取方塊
		jcb1.setMnemonic('T');						// Alt+T可勾選
		jcb2.setMnemonic('R');						// Alt+R可勾選
// 將元件放入內容窗格		
		ct.add(jcb1);								// 核取方塊
		ct.add(jcb2);								// 核取方塊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(200, 120);						// 寬200, 高120
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

