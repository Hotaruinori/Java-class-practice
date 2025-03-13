import java.awt.*;							// 匯入類別庫
public class ch26_5 {	
	static Frame frm = new Frame("ch26_5");
	static Label lab = new Label("明志科技大學", Label.CENTER);
	public static void main(String[] args) {
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		lab.setForeground(Color.blue);		// 文字是藍色
		frm.add(lab);						// 將標籤加入視窗
		frm.setVisible(true);				// 顯示視窗
		
	}
}

