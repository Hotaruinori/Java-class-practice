import java.awt.*;							// 匯入類別庫
public class ch28_4 {	
	static Frame frm = new Frame("ch28_4");
	static Choice ch = new Choice();
	public static void main(String[] args) {
		frm.setLayout(null);				// 不設版面配置
		frm.setSize(200, 160);				// 寬200, 高160
		ch.setBounds(50, 50, 100, 60);		// 表單位置與大小
		ch.add("明志科大");					// 將項目加入表單
		ch.add("台灣科大");
		ch.add("台灣大學");
		ch.add("清華大學");
		ch.add("長庚大學");
		ch.select(0);						// 選取index 0項目
		frm.add(ch);						// 將表單加入視窗
		frm.setVisible(true);				// 顯示視窗
	}
}

