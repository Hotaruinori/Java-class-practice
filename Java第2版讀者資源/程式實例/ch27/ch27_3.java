import java.awt.*;							// 匯入類別庫
import java.awt.event.*;
public class ch27_3 {	
	static Frame frm = new Frame("ch27_3");
	static Button btn = new Button("請按我");	
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());	// 流動式版面配置
		frm.setSize(200, 120);				// 寬200, 高120
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色	

		btn.addActionListener(new ActionListener() {		// 註冊
			public void actionPerformed(ActionEvent e) {	// 事件處理者
				frm.setBackground(Color.gray);
			}
		});
		
		frm.add(btn);						// 將功能鈕加入視窗						
		frm.setVisible(true);				// 顯示視窗	
	}	
}

