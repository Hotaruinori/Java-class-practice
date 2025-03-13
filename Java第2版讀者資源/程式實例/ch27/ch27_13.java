import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_13 {	
	static Frame frm = new Frame("ch27_13");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener extends MouseAdapter{		// 繼承MouseAdapter
		public void mouseClicked(MouseEvent e) { 		// mouseClicked事件處理者
			System.out.println("座標" + e.getX() + "," + e.getY());
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(300, 160);							// 寬300, 高160	
		frm.addMouseListener(new myListener());			// --- 註冊		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

