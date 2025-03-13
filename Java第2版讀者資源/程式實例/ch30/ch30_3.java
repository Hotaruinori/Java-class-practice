import java.awt.*;									// 匯入類別庫
import java.awt.event.*;
public class ch30_3 extends Frame implements ActionListener {
	static ch30_3 frm = new ch30_3();		
	static Button btn = new Button("Rect");			// Rect鈕
	static Boolean rect = false;					// Rect鈕是否被按
	public void actionPerformed(ActionEvent e) {	// 事件處理者
		Graphics g = getGraphics();					// 取得繪圖區物件g
		rect = true;								// Rect鈕被按了
		paint(g);
	}
	public void paint(Graphics g) {					// paint()方法
		if (rect)									// 如果Rect鈕被按
			g.drawRect(50,100,200,100);				// 繪製矩形
	}	
	public static void main(String[] args) {
		FlowLayout fl = new FlowLayout();
		frm.setLayout(fl);							// 流動式版面配置
		frm.setTitle("ch30_3");						// 視窗標題
		frm.setSize(300, 250);						// 寬300, 高250
		frm.add(btn);								// 將功能鈕加入frm
		btn.addActionListener(frm);					// 註冊
		frm.setVisible(true);						// 顯示視窗
	}
}

