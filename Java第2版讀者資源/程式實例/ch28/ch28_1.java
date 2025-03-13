import java.awt.*;							// 匯入類別庫
public class ch28_1 {	
	static Frame frm = new Frame("ch28_1");
	static List lst = new List();
	public static void main(String[] args) {
		frm.setLayout(null);				// 不設版面配置
		frm.setSize(200, 160);				// 寬200, 高160
		lst.setBounds(50, 50, 100, 60);		// 表單位置與大小
		lst.add("明志科大");				// 將項目加入表單
		lst.add("台灣科大");
		lst.add("台灣大學");
		lst.add("清華大學");
		lst.add("長庚大學");
		lst.select(0);						// 選取index 0項目
		frm.add(lst);						// 將表單加入視窗
		frm.setVisible(true);				// 顯示視窗
	}
}

