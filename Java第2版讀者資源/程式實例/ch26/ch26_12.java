import java.awt.*;							// 匯入類別庫
public class ch26_12 {	
	static Frame frm = new Frame("ch26_12");
	static Checkbox cb1 = new Checkbox("研究所");
	static Checkbox cb2 = new Checkbox("大學");
	static Checkbox cb3 = new Checkbox("高中");
	public static void main(String[] args) {
		CheckboxGroup cbg = new CheckboxGroup();	// 建立選項紐群組
		frm.setLayout(null);				// 取消版面配置
		frm.setSize(300, 200);				// 寬300, 高200
		frm.setBackground(Color.yellow); 	// 視窗背景是黃色
		cb1.setBounds(30, 50, 150, 50);		// 核取方塊cb1位置與大小
		cb2.setBounds(30, 90, 150, 50);		// 核取方塊cb2位置與大小
		cb3.setBounds(30, 130, 150, 50);	// 核取方塊cb3位置與大小
		cb1.setCheckboxGroup(cbg);			// 將cb1加入群組cbg	
		cb2.setCheckboxGroup(cbg);			// 將cb2加入群組cbg
		cb3.setCheckboxGroup(cbg);			// 將cb3加入群組cbg
		cb1.setState(true);					// 設定預設選項是cb1
		frm.add(cb1);						// 將cb1加入視窗
		frm.add(cb2);						// 將cb2加入視窗
		frm.add(cb3);						// 將cb3加入視窗		
		frm.setVisible(true);				// 顯示視窗		
	}
}

