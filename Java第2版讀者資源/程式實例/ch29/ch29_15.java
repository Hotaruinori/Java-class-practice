import javax.swing.*;								// 匯入類別庫
import java.awt.*;
import java.awt.event.*;										
public class ch29_15 {	
	static JFrame jfrm = new JFrame("ch29_15");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JRadioButton rb1 = new JRadioButton("男性",true); // 定義選項鈕
	static JRadioButton rb2 = new JRadioButton("女性");	  	 // 定義選項鈕
	static JButton btn = new JButton("Clicked");	// 定義按鈕
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			if (rb1.isSelected()) 					 
				JOptionPane.showMessageDialog(ct,"你是男生");
			if (rb2.isSelected()) 					// 肉絲麵
				JOptionPane.showMessageDialog(ct,"妳是女生");
		}
	}		
	public static void main(String[] args) {
		ct.setLayout(null);							// 設定不用版面配置	
		ButtonGroup bg = new ButtonGroup();			// 建立群組
		bg.add(rb1);								// 選項鈕1放入群組
		bg.add(rb2);								// 選項鈕2放入群組
// 設定版面
		rb1.setBounds(100,50,100,20);
		rb2.setBounds(100,100,100,20);
		btn.setBounds(100,150,80,20);
// 將元件放入內容窗格		
		ct.add(rb1);								// 選項鈕
		ct.add(rb2);								// 選項鈕
		ct.add(btn);								// 按鈕
// 執行註冊
		btn.addActionListener(new myListener());	// --- 註冊	
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(300, 260);						// 寬300, 高260
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

