import java.awt.*;							// 匯入類別庫
public class ch28_2 {	
	static Frame frm = new Frame("ch28_2");
	static List lst = new List();
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));	
		frm.setSize(200, 160);				// 寬200, 高160
		for (int i=0; i < 6; i++) 			// 建立index 0-5
			lst.add("Item" + i);			// 將項目加入List
		lst.select(0);						// 選取index 0項目
		frm.add(lst);						// 將表單加入視窗
		frm.setVisible(true);				// 顯示視窗
		System.out.println("Rows數量 : " + lst.getRows());
		System.out.println("Item數量 : " + lst.getItemCount());
	}
}

