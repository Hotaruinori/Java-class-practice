import java.awt.*;								// 匯入類別庫
public class ch26_17 {	
	static Frame frm = new Frame("ch26_17");		
	public static void main(String[] args) {
		FlowLayout obj =  new FlowLayout(FlowLayout.CENTER,4,8);		
		frm.setLayout(obj);						// 設定版面配置方式
		frm.setSize(300, 200);					// 寬300, 高200
		frm.add(new TextField("Java", 5));
		frm.add(new TextField("入門邁向高手之路", 10));
		frm.add(new TextField("王者歸來", 5));
		frm.add(new TextField("深石數位科技股份有限公司", 16));
		frm.setVisible(true);					// 顯示視窗		
	}
}

