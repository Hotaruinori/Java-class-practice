import java.awt.*;							// 匯入類別庫
public class ch26_7 {	
	static Frame frm = new Frame("ch26_7");
	static Label lab = new Label("Java王者歸來");	
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色		
		lab.setForeground(Color.blue);		// 文字是藍色
		lab.setBackground(Color.pink);		// 文字背景是粉紅色
		lab.setAlignment(Label.CENTER);		// 文字置中
		lab.setLocation(50, 80);			// 設定文字位置
		lab.setSize(150, 50);				// 設定文字區間
		lab.setFont(new Font("Serief", Font.BOLD+Font.ITALIC, 18));		
		frm.add(lab);						// 將標籤lab加入視窗						
		frm.setVisible(true);				// 顯示視窗		
	}
}

