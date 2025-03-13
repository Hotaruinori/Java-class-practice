import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_16 {	
	static JFrame jfrm = new JFrame("ch29_16");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JList<String> jlst = new JList<>();		// 建立JList
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置	
		String[] str = {"明志科大","台灣科大","台北科大","台灣大學","清華大學"};
		jlst.setListData(str);						// 使用字串陣列str建立表單
		jlst.setSelectedIndex(0);					// 設定預設選取
// 將元件放入內容窗格		
		ct.add(jlst);								// 表單
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(200, 160);						// 寬200, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

