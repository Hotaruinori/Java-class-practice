import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有itemEvent
public class ch27_6 {	
	static Frame frm = new Frame("ch27_6");
	static Label lab1 = new Label("請選擇你最愛的程式語言");
	static Label lab2 = new Label("你最愛的是 :          ");
	static Checkbox cb1 = new Checkbox("Java");
	static Checkbox cb2 = new Checkbox("Python");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ItemListener{	// 內部類別
		public void itemStateChanged(ItemEvent e) {		// 事件處理者
			Checkbox cb = (Checkbox) e.getSource();		// 取得所按選項
			if (cb == cb1)
				lab2.setText("你最愛的是 : Java");
			else if(cb == cb2)
				lab2.setText("你最愛的是 : Python");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));	// 流動式版面配置
		frm.setSize(200, 130);							// 寬200, 高130
		CheckboxGroup cbg = new CheckboxGroup();		// 建立選項紐群組cbg
		cb1.setCheckboxGroup(cbg);						// 將cb1加入群組cbg
		cb2.setCheckboxGroup(cbg);						// 將cb2加入群組cbg		
		cb1.addItemListener(new myListener());			// --- 註冊
		cb2.addItemListener(new myListener());			// --- 註冊		
		lab2.setBackground(Color.yellow);				// 文字背景是黃色		
		frm.add(lab1);									// 將lab1加入視窗
		frm.add(cb1);									// 將cb1加入視窗	
		frm.add(cb2);									// 將cb2加入視窗
		frm.add(lab2);									// 將lab2加入視窗
		frm.setVisible(true);							// 顯示視窗	
	}	
}

