import javax.swing.*;								// 匯入類別庫
import java.awt.*;		
import java.awt.event.*;								
public class ch29_25 {	
	static JFrame jfrm = new JFrame("ch29_25");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JTextArea ta = new JTextArea();			// 建立文字方塊
	static JLabel lab = new JLabel("字數與字元數"); // 建立標籤統計資訊
	static JButton btn = new JButton("Count");		// 建立按鈕
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			String text = ta.getText();
			String[] words = text.split("\\s");			// 空白分割句子
			lab.setText("字數 : " + words.length + "  字元數 : " + text.length());		
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// 不設版面配置
// 設定元件在版面位置		
		lab.setBounds(50,30,200,20);				
		ta.setBounds(20,70,280,160);
		btn.setBounds(100,260,100,25);		
// 將元件放入內容窗格		
		ct.add(ta);								
		ct.add(lab);
		ct.add(btn);
// 執行註冊
		btn.addActionListener(new myListener());	// --- 註冊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(350,350);						// 寬350, 高350
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

