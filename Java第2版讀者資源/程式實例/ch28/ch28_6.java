import java.awt.*;									// 匯入類別庫
public class ch28_6 {	
	static Frame frm = new Frame("ch28_6");
	static MenuBar mb = new MenuBar();				// 建立MenuBar
	static Menu menu1 = new Menu("File");			// 建立Menu
	static Menu menu2 = new Menu("Edit");			// 建立Menu
	static MenuItem mI1_1 = new MenuItem("New");	// 建立MenuItem
	static MenuItem mI1_2 = new MenuItem("Save");	// 建立MenuItem
	static MenuItem mI1_3 = new MenuItem("Exit");	// 建立MenuItem
	static MenuItem mI2_1 = new MenuItem("Copy");	// 建立MenuItem
	static MenuItem mI2_2 = new MenuItem("Paste");	// 建立MenuItem
	public static void main(String[] args) {
		mb.add(menu1);						// 在MenuBar加入File Menu
		mb.add(menu2);						// 在MenuBar加入Edit Menu
		menu1.add(mI1_1);					// 將New加入File Menu		
		menu1.add(mI1_2);					// 將Save加入File Menu
		menu1.addSeparator();				// 增加分隔線
		menu1.add(mI1_3);					// 將Exit加入File Menu
		menu2.add(mI2_1);					// 將Copy加入Edit Menu
		menu2.add(mI2_2);					// 將Paste加入Edit Menu
		frm.setSize(200, 160);				// 寬200, 高160
		frm.setMenuBar(mb);					// 設定frm功能表是mb物件
		frm.setVisible(true);				// 顯示視窗
	}
}

