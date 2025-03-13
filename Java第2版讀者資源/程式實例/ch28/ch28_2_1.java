import java.awt.*;							// 匯入類別庫
public class ch28_2_1 {	
	static Frame frm = new Frame("ch28_2_1");
	static List lst = new List();
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));	
		frm.setSize(300, 160);				// 寬300, 高160
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     
		String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();	
		for (String fontFamilyName : fontFamilyNames) 		
			lst.add(fontFamilyName);		// 將字型加入List
		lst.select(0);						// 選取index 0字型
		frm.add(lst);						// 將表單加入視窗
		frm.setVisible(true);				// 顯示視窗
	}
}

