import java.awt.*;							// 匯入類別庫
public class ch26_7_1 {
	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();     
// 列出系統所有字型
		String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();
		for (String fontFamilyName : fontFamilyNames) {
			System.out.println(fontFamilyName);
		}			
	}
}

