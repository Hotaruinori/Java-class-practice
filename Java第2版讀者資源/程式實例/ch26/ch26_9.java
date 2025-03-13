import java.awt.*;							// 匯入類別庫
public class ch26_9 {	
	static Frame frm = new Frame("ch26_9");
	static TextField txt1 = new TextField("Editable");
	static TextField txt2 = new TextField("unEditable");
	static TextField txt3 = new TextField("marked by symbol");
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		txt1.setBounds(30, 40, 150, 20);
		txt2.setBounds(30, 80, 150, 20);
		txt3.setBounds(30, 120, 150, 20);		
		txt2.setEditable(false);			// 設定txt2不可編輯
		txt3.setEchoChar('*');				// 設定txt3以*取代輸入
		frm.add(txt1);						// 將txt1加入視窗
		frm.add(txt2);						// 將txt2加入視窗
		frm.add(txt3);						// 將txt3加入視窗						
		frm.setVisible(true);				// 顯示視窗		
	}
}

