import java.awt.*;								// 匯入類別庫
public class ch26_18 {	
	static Frame frm = new Frame("ch26_18");		
	public static void main(String[] args) {
		CardLayout obj =  new CardLayout(50,30);	
		frm.setLayout(obj);						// 設定版面配置方式
		frm.setSize(300, 200);					// 寬300, 高200
		frm.add(new Button("我是按鈕 1"), "b1");
		frm.add(new Button("我是按鈕 2"), "b2");
		frm.add(new Button("我是按鈕 3"), "b3");
		obj.show(frm, "b3");					// 顯示按鈕3
		frm.setVisible(true);					// 顯示視窗		
	}
}

