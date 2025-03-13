import java.awt.*;									// 匯入類別庫
public class ch28_7 {	
	static Frame frm = new Frame("ch28_7");
	static MenuBar mb = new MenuBar();				// 建立MenuBar
	static Menu menu = new Menu("File");			// 建立Menu
	static Menu submenu = new Menu("Edit");			// 建立SubMenu
	static MenuItem mI1 = new MenuItem("New");		// 建立MenuItem
	static MenuItem mI2 = new MenuItem("Save");		// 建立MenuItem
	static MenuItem mI3 = new MenuItem("Exit");		// 建立MenuItem
	static MenuItem smI1 = new MenuItem("Copy");	// 建立MenuItem
	static MenuItem smI2 = new MenuItem("Paste");	// 建立MenuItem
	public static void main(String[] args) {
		mb.add(menu);						// 在MenuBar加入File Menu
		menu.add(mI1);						// 將New加入File Menu		
		menu.add(mI2);						// 將Save加入File Menu
		menu.addSeparator();				// 增加分隔線
		menu.add(submenu);					// 增加submenu Edit
		menu.addSeparator();				// 增加分隔線
		menu.add(mI3);						// 將Exit加入File Menu
		submenu.add(smI1);					// 將Copy加入Edit SubMenu
		submenu.add(smI2);					// 將Paste加入Edit SubMenu
		frm.setSize(200, 160);				// 寬200, 高160
		frm.setMenuBar(mb);					// 設定frm功能表是mb物件
		frm.setVisible(true);				// 顯示視窗
	}
}

