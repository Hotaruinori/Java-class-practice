import java.awt.*;							// 匯入類別庫
public class ex26_2 {	
	static Frame frm = new Frame("MyWin");
	public static void main(String[] args) {
		frm.setSize(300, 180);				// 寬300, 高180
		frm.setLocation(400, 200);			// 左上角座標(200, 100)
		frm.setVisible(true);				// 顯示視窗

// 取得視窗狀態圖
		System.out.println("視窗x軸座標 : " + frm.getX());
		System.out.println("視窗y軸座標 : " + frm.getY());
		System.out.println("視窗高度    : " + frm.getHeight());
		System.out.println("視窗寬度    : " + frm.getWidth());
		System.out.println("視窗名稱    : " + frm.getName());
		System.out.println("視窗背景色  : " + frm.getBackground());
	}
}

