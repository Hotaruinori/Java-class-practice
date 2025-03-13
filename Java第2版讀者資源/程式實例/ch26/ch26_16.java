import java.awt.*;								// 匯入類別庫
public class ch26_16 {	
	static Frame frm = new Frame("ch26_16");		
	public static void main(String[] args) {
		FlowLayout obj =  new FlowLayout(FlowLayout.RIGHT);		
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

