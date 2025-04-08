package Try_game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PixelCharacterGame extends JFrame implements KeyListener {
    
    // 角色動畫參數
    private static final int FRAME_DELAY = 100; // 毫秒
    private static final int PIXEL_SCALE = 4;   // 像素放大倍數
    
    // 角色精靈圖 (使用 BufferedImage 陣列)
    private BufferedImage[][][] characterSprites;
    private int currentAnimationFrame = 0;
    private int totalAnimationFrames = 3; // 每個方向3幀動畫
    
    // 角色狀態
    private int x = 100, y = 100;
    private int direction = 2; // 0:上, 1:右, 2:下, 3:左
    private boolean isMoving = false;
    
    // 遊戲面板
    private final GamePanel gamePanel = new GamePanel();
    
    public PixelCharacterGame() {
        setTitle("像素角色動畫");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);
        
        // 初始化精靈圖
        initSprites();
        
        // 設定雙緩衝
        gamePanel.setDoubleBuffered(true);
        add(gamePanel);
        
        // 動畫定時器
        Timer animationTimer = new Timer(FRAME_DELAY, e -> {
            if (isMoving) {
                currentAnimationFrame = (currentAnimationFrame + 1) % totalAnimationFrames;
                gamePanel.repaint();
            }
        });
        animationTimer.start();
    }
    
    // 初始化像素精靈圖
    private void initSprites() {
        // 4方向 x 3幀動畫
        characterSprites = new BufferedImage[4][totalAnimationFrames];
        
        // 定義每個方向的顏色 (可自訂)
        Color[] directionColors = {
            new Color(255, 100, 100), // 上 - 紅色系
            new Color(100, 255, 100), // 右 - 綠色系
            new Color(100, 100, 255), // 下 - 藍色系
            new Color(255, 255, 100)   // 左 - 黃色系
        };
        
        // 為每個方向和幀創建精靈圖
        for (int dir = 0; dir < 4; dir++) {
            for (int frame = 0; frame < totalAnimationFrames; frame++) {
                characterSprites[dir][frame] = createCharacterSprite(directionColors[dir], dir, frame);
            }
        }
    }
    
    // 創建角色精靈圖
    private BufferedImage createCharacterSprite(Color color, int direction, int frame) {
        // 原始像素大小 (之後會放大)
        int width = 16;
        int height = 16;
        
        BufferedImage sprite = new BufferedImage(
            width * PIXEL_SCALE, 
            height * PIXEL_SCALE, 
            BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2d = sprite.createGraphics();
        
        // 平滑放大像素圖
        g2d.setRenderingHint(
            RenderingHints.KEY_INTERPOLATION,
            RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        
        // 放大畫布
        g2d.scale(PIXEL_SCALE, PIXEL_SCALE);
        
        // 透明背景
        g2d.setColor(new Color(0, 0, 0, 0));
        g2d.fillRect(0, 0, width, height);
        
        // 根據方向和幀數繪製不同姿勢
        g2d.setColor(color);
        
        // 頭部 (不變部分)
        g2d.fillRect(6, 2, 4, 3);
        
        // 身體和腿部 (根據幀數變化)
        switch (frame) {
            case 0: // 幀1
                g2d.fillRect(6, 5, 4, 6); // 身體
                g2d.fillRect(4, 11, 3, 2); // 左腿
                g2d.fillRect(9, 11, 3, 2); // 右腿
                break;
            case 1: // 幀2
                g2d.fillRect(6, 5, 4, 6);
                g2d.fillRect(5, 11, 3, 2);
                g2d.fillRect(8, 11, 3, 2);
                break;
            case 2: // 幀3
                g2d.fillRect(6, 5, 4, 6);
                g2d.fillRect(6, 11, 3, 2);
                g2d.fillRect(7, 11, 3, 2);
                break;
        }
        
        // 手臂 (根據方向變化)
        switch (direction) {
            case 0: // 上
                g2d.fillRect(3, 5, 3, 4); // 左臂
                g2d.fillRect(10, 5, 3, 4); // 右臂
                break;
            case 1: // 右
                g2d.fillRect(10, 5, 3, 4); // 向前的手臂
                g2d.fillRect(3, 6, 3, 3); // 向後的手臂
                break;
            case 2: // 下
                g2d.fillRect(3, 5, 3, 4);
                g2d.fillRect(10, 5, 3, 4);
                break;
            case 3: // 左
                g2d.fillRect(3, 5, 3, 4); // 向前的手臂
                g2d.fillRect(10, 6, 3, 3); // 向後的手臂
                break;
        }
        
        g2d.dispose();
        return sprite;
    }
    
    // 遊戲面板
    class GamePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // 繪製背景
            g.setColor(new Color(240, 240, 240));
            g.fillRect(0, 0, getWidth(), getHeight());
            
            // 繪製角色
            BufferedImage currentSprite = characterSprites[direction][currentAnimationFrame];
            g.drawImage(currentSprite, x, y, this);
            
            // 繪製說明
            g.setColor(Color.BLACK);
            g.drawString("使用方向鍵移動角色", 10, 20);
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int step = 4;
        isMoving = true;
        
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= step;
                direction = 0;
                break;
            case KeyEvent.VK_RIGHT:
                x += step;
                direction = 1;
                break;
            case KeyEvent.VK_DOWN:
                y += step;
                direction = 2;
                break;
            case KeyEvent.VK_LEFT:
                x -= step;
                direction = 3;
                break;
        }
        
        // 邊界檢查
        x = Math.max(0, Math.min(getWidth() - 16 * PIXEL_SCALE, x));
        y = Math.max(20, Math.min(getHeight() - 16 * PIXEL_SCALE, y));
        
        gamePanel.repaint();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        isMoving = false;
        currentAnimationFrame = 0; // 停止時回到第一幀
        gamePanel.repaint();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

//     // 替代 createCharacterSprite 方法
//     private BufferedImage loadSpriteSheet() {
//         try {
//             return ImageIO.read(new File("spritesheet.png"));
//         } catch (IOException e) {
//             e.printStackTrace();
//             return null;
//         }
// }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PixelCharacterGame game = new PixelCharacterGame();
            game.setVisible(true);
        });
    }
    
}