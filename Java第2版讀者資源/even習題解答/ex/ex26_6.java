import java.awt.*;							// 匯入類別庫
public class ex26_6 {	
	static Frame frm = new Frame("ch26_6");
	static Label lab = new Label("歡迎進入DeepMind系統");
	static Label lab1 = new Label("帳號 : ");
	static Label lab2 = new Label("密碼 : ");
	static TextField txt1 = new TextField("Editable");
	static TextField txt2 = new TextField("marked by symbol");
	static Button btn1 = new Button("確定");
	static Button btn2 = new Button("取消");
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 220);				// 寬300, 高220
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		lab.setForeground(Color.blue);		// 文字是藍色
		lab.setLocation(30, 30);			// 設定文字區間
		lab.setSize(150, 50);
		lab1.setForeground(Color.blue);		// 文字是藍色
		lab1.setLocation(30, 80);			// 設定文字區間
		lab1.setSize(50, 30);
		lab2.setForeground(Color.blue);		// 文字是藍色
		lab2.setLocation(30, 120);			// 設定文字區間
		lab2.setSize(50, 30);
			
		txt1.setBounds(80, 80, 150, 20);
		txt2.setBounds(80, 120, 150, 20);		
		txt2.setEchoChar('*');				// 設定txt3以*取代輸入
		btn1.setBounds(80, 160, 60, 40);	// 設定按鈕位置與大小
		btn2.setBounds(170, 160, 60, 40);	// 設定按鈕位置與大小
		frm.add(txt1);						// 將txt1加入視窗
		frm.add(txt2);						// 將txt2加入視窗
		frm.add(lab);
		frm.add(lab1);
		frm.add(lab2);
		frm.add(btn1);
		frm.add(btn2);
		frm.setVisible(true);				// 顯示視窗		
	}
}

