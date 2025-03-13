import java.awt.*;	
import java.util.Random;								// 匯入類別庫
public class ex30_2 extends Frame {
	static ex30_2 frm = new ex30_2();			
	public void paint(Graphics g) {						// paint()方法
		Random ran = new Random();
		Insets ins = getInsets();						// 取得繪圖區
		int width = getWidth() - (ins.left+ins.right);	// 取得繪圖區寬度
		int height = getHeight() - (ins.top+ins.bottom);// 取得繪圖區高度
		int color = ran.nextInt(5);
		switch (color) {
			case 0: g.setColor(Color.red);
					break;
			case 1: g.setColor(Color.green);
					break;	
			case 2: g.setColor(Color.blue);
					break;	
			case 3: g.setColor(Color.yellow);
					break;		
			case 4: g.setColor(Color.gray);
					break;
		}
		g.drawRect(ins.left,ins.top,width-1,height-1);	// 繪製矩形
	}	
	public static void main(String[] args) {
		frm.setTitle("ch30_5");							// 視窗標題
		frm.setSize(200, 160);							// 寬200, 高160	
		frm.setVisible(true);							// 顯示視窗
	}
}

