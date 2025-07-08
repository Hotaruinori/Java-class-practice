package old;


// * 表示導入該套件下的所有類別，包括 JFrame, JLabel 等
import javax.swing.*;

public class Swing01 {
    private static void createAndShowGUI() {
        // 創建及設置窗口，JFrame 是 Swing 中的頂層容器，代表一個視窗。
        // 建構函式參數 "HelloWorldSwing" 設定視窗標題
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) 設定當用戶點擊關閉按鈕時終止應用程式
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加 "Hello World" 標籤，JLabel 是用於顯示文字或圖標的輕量級元件
        // frame.getContentPane() 獲取視窗的內容面板，所有元件都應添加到內容面板中
        // add() 方法將元件添加到內容面板的預設佈局（BorderLayout.CENTER）
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // 顯示窗口（強制設置大小）
        // setSize(300, 200) 設定視窗寬度300像素，高度200像素
        // setVisible(true) 使視窗可見（默認是不可見的）
        // 註解掉的 frame.pack() 會根據內容自動調整視窗大小
        frame.setSize(300, 200);
        // frame.pack();  
        frame.setVisible(true);

        
    }

    public static void main(String[] args) {
        // 確保 GUI 在事件分發線程中創建
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
}