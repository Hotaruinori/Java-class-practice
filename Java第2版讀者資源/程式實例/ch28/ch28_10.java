import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有Event
public class ch28_10 {	
	static Frame frm = new Frame("ch28_10");		
	static Scrollbar sc = new Scrollbar();			// 建立垂直捲軸
	static Label lab = new Label();					// 建立標籤
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements AdjustmentListener{		
		public void adjustmentValueChanged(AdjustmentEvent e) {	
			lab.setText("垂直捲軸 : " + sc.getValue());	// 取得捲軸值
		}
	}
	public static void main(String[] args) {
		frm.setLayout(null);						// 不設版面配置
		sc.addAdjustmentListener(new myListener()); // 註冊
		sc.setBounds(115,80,20,150);				// 設定捲軸位置與大小
		sc.setValues(50,10,0,100);					// 設定捲軸相關值
		
		lab.setAlignment(Label.CENTER);				// 設定標籤置中對齊
		lab.setBounds(50,50,150,20);				// 設定標籤位置與大小
		lab.setText("垂直捲軸 : " + sc.getValue());	// 輸出標籤		
						
		frm.add(sc);								// 垂直捲軸加入視窗
		frm.add(lab);								// 標籤加入視窗
		frm.setSize(250, 250);						// 寬250, 高250
		frm.setVisible(true);						// 顯示視窗
	}
}

