import java.awt.*;									// 匯入類別庫
public class ch30_4 extends Frame {
	static ch30_4 frm = new ch30_4();			
	public void paint(Graphics g) {					// paint()方法		
		g.drawRect(50,100,200,100);					// 繪製矩形
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_4");						// 視窗標題
		frm.setSize(300, 250);						// 寬300, 高250	
		frm.setVisible(true);						// 顯示視窗
	}
}

