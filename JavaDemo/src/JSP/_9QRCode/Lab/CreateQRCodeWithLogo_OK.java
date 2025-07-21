
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.*;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


public class CreateQRCodeWithLogo_OK 
{
    public static void main(String[] args) 
    {
        // 寬度和高度
        int width = 300;
        int height = 300;
        // 圖片的格式
        String format = "png";
        // 內容
        String contents = "https://www.google.com";
        
        Path file = Paths.get("./QR_CODE/name.png");
       
        HashMap<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        //容錯率且可以將它想像成解析度，分為 4 級：L(7%)，M(15%)，Q(25%)，H(30%)
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        
        hints.put(EncodeHintType.MARGIN, 3); //留白
                
        try{
            
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix bitMatrix = writer.encode(contents, BarcodeFormat.QR_CODE, width, height,hints);
            
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
            System.out.println("QR_Code 建立完成!!!");
            
            BufferedImage baseImage = ImageIO.read(new File("./QR_CODE/name.png"));
            System.out.println("讀取./QR_CODE/name.png");
            BufferedImage overlayImage = ImageIO.read(new File("./google.png"));
            System.out.println("讀取./google.png");
            
            int baseWidth = baseImage.getWidth();
            int baseHeight = baseImage.getHeight();
            int overlayWidth = overlayImage.getWidth();
            int overlayHeight = overlayImage.getHeight();
            
            BufferedImage combinedImage = new BufferedImage(baseWidth, baseHeight, BufferedImage.TYPE_INT_ARGB);
            
            for (int y = 0; y < baseHeight; y++) {
                for (int x = 0; x < baseWidth; x++) {
                    int basePixel = baseImage.getRGB(x, y);
                    combinedImage.setRGB(x, y, basePixel);
                }
            }
            
            //計算插圖左上角座標
            int startX = (baseWidth - overlayWidth) / 2;
            int startY = (baseHeight - overlayHeight) / 2;
            
            for (int y = 0; y < overlayHeight; y++) {
                for (int x = 0; x < overlayWidth; x++) {
                    int overlayPixel = overlayImage.getRGB(x, y);
                    int alpha = (overlayPixel >> 24) & 0xFF;
                    if (alpha > 0) {
                        int finalX = startX + x;
                        int finalY = startY + y;
                        combinedImage.setRGB(finalX, finalY, overlayPixel);
                    }
                }
            }
            
            ImageIO.write(combinedImage, "PNG", new File("./QR_CODE/QR_Codewithlogo.png"));
            System.out.println("QR_Codewithlogo 建立完成!!!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
