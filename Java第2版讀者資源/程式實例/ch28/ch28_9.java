import java.awt.*;									// 匯入類別庫
public class ch28_9 {	
	static Frame frm = new Frame("ch28_9");		
	static Scrollbar scv = new Scrollbar();			// 建立垂直捲軸
	static Scrollbar sch = new Scrollbar(Scrollbar.HORIZONTAL); //水平
	public static void main(String[] args) {
		frm.setLayout(null);						// 不設版面配置
		scv.setBounds(50,50,15,100);				// 垂直捲軸位置與大小			
		sch.setBounds(100,75,100,15);				// 水平捲軸位置與大小
		frm.add(scv);								// 垂直捲軸加入視窗
		frm.add(sch);								// 水平捲軸加入視窗
		frm.setSize(250, 180);						// 寬250, 高180
		frm.setVisible(true);						// 顯示視窗
	}
}

