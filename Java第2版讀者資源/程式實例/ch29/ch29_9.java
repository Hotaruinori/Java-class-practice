import javax.swing.*;								// 匯入類別庫
import java.awt.*;
import java.awt.event.*;										
public class ch29_9 {	
	static JFrame jfrm = new JFrame("ch29_9");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JLabel lab = new JLabel();				// 定義標籤	
	static int index = 0;							// 定義標籤圖示索引
	static ImageIcon[] labfig = new ImageIcon[3];	// 用在標籤的圖示陣列
// 定義按鈕圖示和按鈕
	static ImageIcon arrowLeft =  new ImageIcon("arrowleft.gif");
	static ImageIcon arrowRight =  new ImageIcon("arrowright.gif");	
	static JButton btn1 = new JButton("Prev", arrowLeft);	// 往前
	static JButton btn2 = new JButton("next", arrowRight);	// 往後
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			JButton btn = (JButton) e.getSource();	// 獲得按鈕
			int figLength = labfig.length;			// 圖示數量
			if (btn==btn1 && index>0) 			// 按Prev鈕設定新索引index值
				index--;
			if (btn==btn2 && index<figLength-1) // 按Next鈕設定新索引index值
				index++;
			lab.setText("snow" + index + ".jpg");	// 設定新標籤圖示
			lab.setIcon(labfig[index]);				// 設定新標籤字串
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());				// 設定流動版面配置		
// 設定標籤和圖示
		labfig[0] = new ImageIcon("snow0.jpg");		// 圖示索引0
		labfig[1] = new ImageIcon("snow1.jpg");		// 圖示索引1
		labfig[2] = new ImageIcon("snow2.jpg");		// 圖示索引2
		lab.setIcon(labfig[0]);						// 預設顯示圖示索引0
		lab.setText("snow0.jpg");
		lab.setHorizontalTextPosition(JLabel.CENTER);	// 水平中央
		lab.setVerticalTextPosition(JLabel.TOP);		// 垂直上方	
// 設定功能紐btn2的Next字串放在圖示的左邊
		btn2.setHorizontalTextPosition(JButton.LEFT);	// 在Next字串右邊放圖示		
// 將元件放入內容窗格		
		ct.add(lab);								// 在內容窗格建立標籤
		ct.add(btn1);								// 在內容窗格建立按鈕
		ct.add(btn2);								// 在內容窗格建立按鈕	
// 執行註冊
		btn1.addActionListener(new myListener());		// --- 註冊
		btn2.addActionListener(new myListener());		// --- 註冊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(600, 480);						// 寬600, 高480
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

