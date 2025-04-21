package old;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PixelCharacterGame extends JFrame implements KeyListener {
    
    private static final String[][][] CHARACTER_SPRITES = {
        { // 上
            {"  O  ", " /|\\ ", " / \\ "},
            {"  O  ", " /|\\ ", "  |  "}
        },
        { // 右
            {"  O  ", " <|  ", " / \\ "},
            {"  O  ", " <|\\ ", "   \\ "}
        },
        { // 下
            {"  O  ", " /|\\ ", " / \\ "},
            {"  O  ", "  |  ", " / \\ "}
        },
        { // 左
            {"  O  ", "  |> ", " / \\ "},
            {"  O  ", " /|> ", " /   "}
        }
    };
    
    private int x = 100, y = 100;
    private int direction = 2;
    private int animationFrame = 0;
    private long lastFrameTime = 0;
    
    // 使用自訂面板來處理繪圖
    private final GamePanel gamePanel = new GamePanel();
    
    public PixelCharacterGame() {
        setTitle("點陣圖角色動畫");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);
        
        // 設定雙緩衝
        gamePanel.setDoubleBuffered(true);
        add(gamePanel);
        
        Timer timer = new Timer(100, e -> {
            gamePanel.repaint();
        });
        timer.start();
    }
    
    // 專門處理繪圖的面板
    class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // 背景
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, getWidth(), getHeight());
            
            // 角色繪製
            g.setColor(Color.BLACK);
            g.setFont(new Font("Monospaced", Font.PLAIN, 12));
            
            if (System.currentTimeMillis() - lastFrameTime > 200) {
                animationFrame = 1 - animationFrame;
                lastFrameTime = System.currentTimeMillis();
            }
            
            String[] sprite = CHARACTER_SPRITES[direction][animationFrame];
            for (int i = 0; i < sprite.length; i++) {
                g.drawString(sprite[i], x, y + i * 15);
            }
            
            // 說明文字
            g.drawString("使用方向鍵移動角色", 10, 20);
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int step = 5;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: y -= step; direction = 0; break;
            case KeyEvent.VK_RIGHT: x += step; direction = 1; break;
            case KeyEvent.VK_DOWN: y += step; direction = 2; break;
            case KeyEvent.VK_LEFT: x -= step; direction = 3; break;
        }
        x = Math.max(0, Math.min(getWidth() - 30, x));
        y = Math.max(30, Math.min(getHeight() - 30, y));
        gamePanel.repaint();
    }
    
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PixelCharacterGame game = new PixelCharacterGame();
            game.setVisible(true);
        });
    }
}