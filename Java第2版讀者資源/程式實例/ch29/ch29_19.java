import javax.swing.*;								// 匯入類別庫
import java.awt.*;										
public class ch29_19 {	
	static JFrame jfrm = new JFrame("ch29_19");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JList<String> jlst = new JList<>();		// 表單物件
	public static void main(String[] args) {
		ct.setLayout(new BorderLayout());			// 設定邊界版面配置	
		DefaultListModel<String> lst = new DefaultListModel<>();
		lst.addElement("明志科大");
		lst.addElement("台灣科大");
		lst.addElement("台北科大");
		lst.addElement("台灣大學");
		lst.addElement("清華大學");
		lst.addElement("長庚科大");
		lst.addElement("雲林科大");
		lst.addElement("虎尾科大");
		lst.addElement("交通大學");
		lst.addElement("中央大學");
		jlst = new JList<>(lst);					// 建立表單
		jlst.setSelectedIndex(0);					// 設定預設選取
// 將元件放入內容窗格		
		ct.add(new JScrollPane(jlst));				// 表單增加捲軸
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(300, 220);						// 寬300, 高220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

