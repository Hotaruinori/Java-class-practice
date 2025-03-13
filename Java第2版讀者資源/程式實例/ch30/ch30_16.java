import java.awt.*;									// 匯入類別庫
import javax.swing.*;
public class ch30_16 extends JComponent implements Runnable { 
	Thread t; 										//執行緒
	static boolean ballRun = true; 					//是否移動 
	static int x = 140, y = 0; 						//圓最初座標		
	static int yDir = 1; 							//正值表示往下移動 
	static int dy = 10; 							//移動大小 
	static int ballSize = 20;						//圓大小
	ch30_16(){ 
		t = new Thread(this); 						// 建立一個執行緒
		t.start(); 
	}	
	public void run() { 
		while(ballRun){ 
			repaint();								// 重新繪製
			try { 
				Thread.sleep(100); 					// 休息0.1秒
			} catch (InterruptedException e) { e.printStackTrace(); }
		} 
	}
	public void paint(Graphics g){ 
		if (y > (this.getSize().height - ballSize)){ 	// 反彈球觸底
			yDir = -1; 
		} 
		if (y <= 0){ 								// 反彈球觸頂
			yDir = 1; 
		} 
		y += dy * yDir; 							// 反彈球y位置
		g.setColor(Color.blue); 					// 設定反彈球顏色
		g.fillOval(x, y, ballSize, ballSize); 		// 繪製反彈球
	} 
	public static void main(String[] args){ 
		JFrame frm = new JFrame("ch30_16"); 
		Container cp = frm.getContentPane(); 
		cp.add(new ch30_16());
		frm.setSize(300,240); 
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE); 
		frm.setVisible(true); 
	}
}


