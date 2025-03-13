import java.awt.*;									// 匯入類別庫
import java.awt.event.*;
public class ch30_15 extends Frame implements MouseListener, MouseMotionListener {
	static ch30_15 frm = new ch30_15();		
	static int x1,y1,x2,y2;
	public void mouseDragged(MouseEvent e) {		// 事件處理者
		Graphics g = getGraphics();					// 取得繪圖區物件g
		x2 = e.getX();								// 取得拖曳滑鼠時x座標
		y2 = e.getY();								// 取得拖曳滑鼠時y座標
		g.setColor(Color.blue);						// 設定繪製藍色線條
		g.drawLine(x1,y1,x2,y2);					// 繪製線條
		x1 = x2;									// 更新x1座標
		y1 = y2;									// 更新y1座標
	}
	public void mousePressed(MouseEvent e) {					
		x1 = e.getX();								// 取得滑鼠按下時x座標
		y1 = e.getY();								// 取得滑鼠按下時y座標
	}	
	public void mouseMoved(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public static void main(String[] args) {
		frm.setTitle("ch30_15");					// 視窗標題
		frm.setSize(300, 250);						// 寬300, 高250
		frm.addMouseListener(frm);					// 註冊			
		frm.addMouseMotionListener(frm);			// 註冊
		frm.setVisible(true);						// 顯示視窗
	}
}

