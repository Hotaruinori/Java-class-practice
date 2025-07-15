
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadQRCode 
{
    public static void main(String[] args) 
    {       
        MultiFormatReader formatReader = new MultiFormatReader();
        
        File file = new File("./QR_Code/name.png");
      
        BufferedImage image;
        try {
            
            image = ImageIO.read(file);
            BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(image);
            
            BinaryBitmap binaryBitmap = new BinaryBitmap(                   
                                             new HybridBinarizer(source));
 
            HashMap hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
            // 解析
            Result result = formatReader.decode(binaryBitmap,hints);
            
            System.out.println("解析結果-");
            System.out.println("格式："+result.getBarcodeFormat());
            System.out.println("內容："+result.getText());
            //System.out.println("內容："+result.toString());
            
        } 
		catch (Exception e) {}
                    
    }
}