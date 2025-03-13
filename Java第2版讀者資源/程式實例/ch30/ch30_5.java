import java.awt.*;										// 匯入類別庫
public class ch30_5 extends Frame {
	static ch30_5 frm = new ch30_5();			
	public void paint(Graphics g) {						// paint()方法
		Insets ins = getInsets();						// 取得繪圖區
		int width = getWidth() - (ins.left+ins.right);	// 取得繪圖區寬度
		int height = getHeight() - (ins.top+ins.bottom);// 取得繪圖區高度
		System.out.println("左邊框 : " + ins.left);
		System.out.println("右邊框 : " + ins.right);
		System.out.println("上邊框 : " + ins.top);
		System.out.println("下邊框 : " + ins.bottom);		
		g.drawRect(ins.left,ins.top,width-1,height-1);	// 繪製矩形
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_5");							// 視窗標題
		frm.setSize(200, 160);							// 寬200, 高160	
		frm.setVisible(true);							// 顯示視窗
	}
}

