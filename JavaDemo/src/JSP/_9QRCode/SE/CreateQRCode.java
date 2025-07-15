
import java.io.File;
import java.nio.file.*;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


public class CreateQRCode
{
    public static void main(String[] args) 
    {
        // 寬度和高度
        int width = 300;
        int height = 300;
        // 圖片的格式
        String format = "png";
        // 內容
        String contents = "ted,1019";
        
        File folder = new File("QR_Code");
        String fname = "name.png";

        // 檢查資料夾是否存在
        if(!folder.exists()) {
            // 如果資料夾不存在, 立即建立
            folder.mkdirs();
        }    
        
        Path file = new File(folder + "/" + fname).toPath();
        //Path file = Paths.get(folder + "/" + fname);
       
        HashMap<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        //容錯率且可以將它想像成解析度，分為 4 級：L(7%)，M(15%)，Q(25%)，H(30%)
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        
        hints.put(EncodeHintType.MARGIN, 3); //留白
                
        try {
            
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix bitMatrix = writer.encode(contents, BarcodeFormat.QR_CODE, width, height,hints);
            
            MatrixToImageWriter.writeToPath(bitMatrix, format, file);
            System.out.println("QRCode建立完成!!!");
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}