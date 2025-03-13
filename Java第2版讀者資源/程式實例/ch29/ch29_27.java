import javax.swing.*;						// 匯入類別庫									
public class ch29_27 {	
	static JFrame frm = new JFrame("ch29_27");
	static JTextArea ta = new JTextArea(200,200);
	static JTabbedPane tp = new JTabbedPane();
	static JPanel p1 = new JPanel();
	static JPanel p2 = new JPanel();
	static JPanel p3 = new JPanel();
	public static void main(String[] args) {
		frm.setLayout(null);				// 不設版面配置	
		tp.setBounds(50,50,200,200);
		p1.add(ta);							// 文字區放入Jpanel
		tp.add("個人學歷", p1);				// JPanel放入JTabbedPane
		tp.add("經歷", p2);					// JPane2放入JTabbedPane
		tp.add("著作", p3);					// JPane3放入JTabbedPane
		frm.add(tp);						// 將JTabbedPane放入Frame
// 設定視窗大小和可以顯示與結束程式					
		frm.setSize(350,350);				// 寬350, 高350
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setVisible(true);				// 顯示視窗
	}
}

