import java.awt.*;								// 匯入類別庫
public class ch26_15 {	
	static Frame frm = new Frame("ch26_15");		
	public static void main(String[] args) {
		GridLayout obj =  new GridLayout(2,3);	// rows=2,cols=3	
		frm.setLayout(obj);						// 設定版面配置方式
		frm.setSize(300, 200);					// 寬300, 高200
		frm.add(new Button("1"));
		frm.add(new Button("2"));
		frm.add(new Button("3"));
		frm.add(new Button("4"));
		frm.add(new Button("5"));
		frm.add(new Button("6"));
		frm.setVisible(true);					// 顯示視窗		
	}
}

