import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch28_8 {	
	static Frame frm = new Frame("ch28_8");
	static MenuBar mb = new MenuBar();					// 建立MenuBar
	static Menu menu = new Menu("Font");				// 建立Menu Font
	static MenuItem mI1 = new MenuItem("Bold");			// 建立MenuItem
	static MenuItem mI2 = new MenuItem("Italic");		// 建立MenuItem
	static MenuItem mI3 = new MenuItem("Plain");		// 建立MenuItem
	static MenuItem mI4 = new MenuItem("Exit");			// 建立MenuItem
	static Label lab = new Label("Java",Label.CENTER);	// 建立Label
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			MenuItem item = (MenuItem) e.getSource();	// 取得所按選項
			if (item == mI1)							// 如果true建立BOLD
				lab.setFont(new Font("Times New Roman",Font.BOLD,36));		
			else if (item == mI2)						// 如果true建立ITALIC
				lab.setFont(new Font("Times New Roman",Font.ITALIC,36));			
			else if (item == mI3)						// 如果true建立PLAIN
				lab.setFont(new Font("Times New Roman",Font.PLAIN,36));			
			else if (item == mI4)
				frm.dispose();							// 關閉視窗
		}
	}
	public static void main(String[] args) {
		mb.add(menu);									// 在MenuBar加入File Menu
		menu.add(mI1);									// 將Bold加入File Menu		
		menu.add(mI2);									// 將Italic加入File Menu
		menu.add(mI3);									// 將Plain加入File Menu
		menu.addSeparator();							// 增加分隔線
		menu.add(mI4);									// 將Exit加入File Menu	
		mI1.addActionListener(new myListener());		// --- 註冊
		mI2.addActionListener(new myListener());		// --- 註冊
		mI3.addActionListener(new myListener());		// --- 註冊
		mI4.addActionListener(new myListener());		// --- 註冊	
		lab.setFont(new Font("Times New Roman",Font.PLAIN,36));		
		frm.add(lab);									// 將Label加入視窗
		frm.setSize(250, 160);							// 寬250, 高160
		frm.setMenuBar(mb);								// 設定frm功能表是mb物件
		frm.setVisible(true);							// 顯示視窗
	}
}

