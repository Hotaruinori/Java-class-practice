import java.awt.*;								// 匯入類別庫
public class ch26_13 {	
	static Frame frm = new Frame("ch26_13");		
	public static void main(String[] args) {
		BorderLayout obj =  new BorderLayout(4, 2);	
		frm.setLayout(obj);						// 設定版面配置方式
		frm.setSize(300, 200);					// 寬300, 高200
		frm.add(new Button("東"), obj.EAST);
		frm.add(new Button("西"), obj.WEST);
		frm.add(new Button("南"), obj.SOUTH);
		frm.add(new Button("北"), obj.NORTH);
		frm.add(new Button("中"), obj.CENTER);
		frm.setVisible(true);					// 顯示視窗		
	}
}

