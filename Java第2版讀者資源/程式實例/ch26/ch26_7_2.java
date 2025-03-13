import java.awt.*;							// 匯入類別庫
public class ch26_7_2 {
	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     		
// 認識建構Font的方法
		Font[] fonts = graphicsEnv.getAllFonts();
		for (Font font : fonts) {
			System.out.println(font);
		}
	}
}

