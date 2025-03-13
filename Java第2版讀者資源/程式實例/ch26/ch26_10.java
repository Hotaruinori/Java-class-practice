import java.awt.*;							// 匯入類別庫
public class ch26_10 {	
	static Frame frm = new Frame("ch26_10");
	static TextArea txt = new TextArea("TextArea",2,20,
						TextArea.SCROLLBARS_VERTICAL_ONLY);
	public static void main(String[] args) {
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		txt.setBounds(30, 40, 150, 50);		// 文字區位置與大小
		frm.add(txt);						// 將txt加入視窗						
		frm.setVisible(true);				// 顯示視窗		
	}
}

