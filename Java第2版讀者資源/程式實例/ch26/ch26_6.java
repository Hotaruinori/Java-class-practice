import java.awt.*;							// 匯入類別庫
public class ch26_6 {	
	static Frame frm = new Frame("ch26_6");
	static Label lab1 = new Label();		// Labe物件lab1
	static Label lab2 = new Label();		// Labe物件lab2
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		lab1.setText("Java");				// 設定文字Java
		lab1.setForeground(Color.blue);		// 文字是藍色
		lab1.setBounds(50, 50, 100, 30);	// 設定文字位置與大小
		lab2.setText("Python");				// 設定文字Python
		lab2.setForeground(Color.green);	// 文字是綠色
		lab2.setBounds(50, 100, 100, 30);	// 設定文字位置與大小		
		frm.add(lab1);						// 將標籤lab1加入視窗
		frm.add(lab2);						// 將標籤lab2加入視窗					
		frm.setVisible(true);				// 顯示視窗
		
	}
}

