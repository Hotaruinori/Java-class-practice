import java.awt.*;							// 匯入類別庫
public class ch26_2 {	
	static Frame frm = new Frame("ch26_2");
	public static void main(String[] args) {
		frm.setSize(200, 152);				// 寬200, 高152
		frm.setBackground(Color.yellow);	// 視窗背景是黃色
		frm.setLocation(200, 100);			// 左上角座標(200, 100)
		frm.setVisible(true);				// 顯示視窗
		frm.setName("myWin");				// 視窗名稱
// 取得視窗狀態圖
		System.out.println("視窗x軸座標 : " + frm.getX());
		System.out.println("視窗y軸座標 : " + frm.getY());
		System.out.println("視窗高度    : " + frm.getHeight());
		System.out.println("視窗寬度    : " + frm.getWidth());
		System.out.println("視窗名稱    : " + frm.getName());
		System.out.println("視窗背景色  : " + frm.getBackground());
	}
}

