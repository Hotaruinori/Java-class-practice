import java.awt.*;							// 匯入類別庫
public class ch26_8 {	
	static Frame frm = new Frame("ch26_8");
	static Button btn = new Button("Click me");	
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色		
		btn.setBounds(100, 80, 100, 50);	// 設定按鈕位置與大小
		frm.add(btn);						// 將btn加入視窗						
		frm.setVisible(true);				// 顯示視窗		
	}
}

