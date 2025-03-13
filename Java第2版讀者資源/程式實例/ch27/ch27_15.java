import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_15 {	
	static Frame frm = new Frame("ch27_15");
	static Label xlab = new Label();					// 標籤紀錄x軸
	static Label ylab = new Label();					// 標籤紀錄y軸
	static Label lab = new Label();						// 紀錄事件
// 擔任事件傾聽者和擁有事件處理者
	static class myListener extends MouseMotionAdapter{	// 實作MouseMotionAdapter
		public void mouseDragged(MouseEvent e) { 		// mouseDragged事件處理者
			xlab.setText("x = " + e.getX());			// 輸出x座標
			ylab.setText("y = " + e.getY());			// 輸出y座標
			lab.setText("Mouse Dragged");				// 輸出滑鼠被拖曳
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(200, 160);							// 寬200, 高160	
		xlab.setBounds(40, 50, 50, 20);					// xlab位置和大小
		ylab.setBounds(120, 50, 50, 20);				// ylab位置和大小
		lab.setBounds(50, 120, 100, 20);				// lab位置和大小
		frm.add(xlab);									// 將xlab加入視窗
		frm.add(ylab);									// 將ylab加入視窗
		frm.add(lab);									// 將lab加入視窗
		frm.addMouseMotionListener(new myListener());	// --- 註冊		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

