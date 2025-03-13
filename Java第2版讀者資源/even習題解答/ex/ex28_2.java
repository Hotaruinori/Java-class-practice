import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ex28_2 {	
	static Frame frm = new Frame("ex28_2");
	static MenuBar mb = new MenuBar();					// 建立MenuBar
	static Menu menu1 = new Menu("Font");				// 建立Menu Font
	static Menu menu2 = new Menu("Color");				// 建立Menu
	static MenuItem mI1_1 = new MenuItem("Bold");			// 建立MenuItem
	static MenuItem mI1_2 = new MenuItem("Italic");		// 建立MenuItem
	static MenuItem mI1_3 = new MenuItem("Plain");		// 建立MenuItem
	static MenuItem mI1_4 = new MenuItem("Exit");			// 建立MenuItem
	static MenuItem mI2_1 = new MenuItem("Green");			// 建立MenuItem
	static MenuItem mI2_2 = new MenuItem("Blue");		// 建立MenuItem
	static MenuItem mI2_3 = new MenuItem("Yellow");		// 建立MenuItem
	static Label lab = new Label("Java",Label.CENTER);	// 建立Label
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			MenuItem item = (MenuItem) e.getSource();	// 取得所按選項
			if (item == mI1_1)							// 如果true建立BOLD
				lab.setFont(new Font("Times New Roman",Font.BOLD,36));		
			else if (item == mI1_2)						// 如果true建立ITALIC
				lab.setFont(new Font("Times New Roman",Font.ITALIC,36));			
			else if (item == mI1_3)						// 如果true建立PLAIN
				lab.setFont(new Font("Times New Roman",Font.PLAIN,36));	
			else if (item == mI2_1)						
				lab.setForeground(Color.green);
			else if (item == mI2_2)						
				lab.setForeground(Color.blue);
			else if (item == mI2_3)						
				lab.setForeground(Color.yellow);
			else if (item == mI1_4)
				frm.dispose();							// 關閉視窗
		}
	}
	public static void main(String[] args) {
		mb.add(menu1);									// 在MenuBar加入File Menu
		mb.add(menu2);									// 在MenuBar加入File Menu
		menu1.add(mI1_1);								// 將Bold加入File Menu		
		menu1.add(mI1_2);								// 將Italic加入File Menu
		menu1.add(mI1_3);								// 將Plain加入File Menu
		menu1.addSeparator();							// 增加分隔線
		menu1.add(mI1_4);								// 將Exit加入File Menu
		
		menu2.add(mI2_1);										
		menu2.add(mI2_2);									
		menu2.add(mI2_3);									
		mI1_1.addActionListener(new myListener());		// --- 註冊
		mI1_2.addActionListener(new myListener());		// --- 註冊
		mI1_3.addActionListener(new myListener());		// --- 註冊
		mI1_4.addActionListener(new myListener());		// --- 註冊	
		mI2_1.addActionListener(new myListener());		// --- 註冊
		mI2_2.addActionListener(new myListener());		// --- 註冊
		mI2_3.addActionListener(new myListener());		// --- 註冊
		
		lab.setFont(new Font("Times New Roman",Font.PLAIN,36));		
		frm.add(lab);									// 將Label加入視窗
		frm.setSize(250, 160);							// 寬250, 高160
		frm.setMenuBar(mb);								// 設定frm功能表是mb物件
		frm.setVisible(true);							// 顯示視窗
	}
}

