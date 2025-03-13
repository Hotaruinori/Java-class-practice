import javax.swing.*;								// 匯入類別庫
import java.awt.*;	
import java.util.*;
import java.awt.event.*;									
public class ch29_20 {	
	static JFrame jfrm = new JFrame("ch29_20");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JList<String> jlst1 = new JList<>();		// 表單物件1
	static JList<String> jlst2 = new JList<>();		// 表單物件2
	static Vector<String> vector = new Vector<String>(); // 表單2的項目
// 擔任事件傾聽者和擁有事件處理者
	static class myListener extends MouseAdapter{	// 內部類別
		public void mouseClicked(MouseEvent e) {	// 事件處理者
			if (e.getSource() == jlst1)
				if (e.getClickCount() == 2) {		// 連按2次
					vector.add(jlst1.getSelectedValue());	// 取得選項
					jlst2.setListData(vector);				// 設定表單2
				}
		}
	}		
	public static void main(String[] args) {
		ct.setLayout(new GridLayout());				// 設定方格版面配置	
		DefaultListModel<String> lst1 = new DefaultListModel<>();
		lst1.addElement("明志科大");
		lst1.addElement("台灣科大");
		lst1.addElement("台北科大");
		lst1.addElement("台灣大學");
		lst1.addElement("清華大學");
		lst1.addElement("長庚科大");
		lst1.addElement("雲林科大");
		jlst1 = new JList<>(lst1);					// 建立表單
// 將元件放入內容窗格		
		ct.add(new JScrollPane(jlst1));				// 表單1增加捲軸
		ct.add(new JScrollPane(jlst2));				// 表單2
// 註冊傾聽者
		jlst1.addMouseListener(new myListener());	// 註冊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(300, 160);						// 寬300, 高220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

