<%@ page contentType="image/jpeg" pageEncoding="UTF-8" %>
<%@ page import="java.awt.*,java.awt.image.*"%>
<%@ page import="java.util.*" %>
<%@ page import="javax.imageio.*" %>

<%
  //設定頁面不使用緩衝區
  response.setHeader("Cache-Control","no-cache");
  response.setDateHeader("Expires", 0);

  // 在記憶體中建立圖像
  int width=60, height=20;
  //建立BufferedImage物件 
  BufferedImage image;


  //取得Graphics物件
  Graphics g = image.getGraphics();

  //建立亂數產生器物件   
  Random random = new Random();

  //設定顏色,繪製填滿顏色的矩形
    /* 未撰寫 */
	
	

  //設定字體
  g.setFont(new Font("Times New Roman",Font.PLAIN,18));

  //隨機產生的認證碼(4位數)
  //寫入矩形內,每位數顏色不同
  String sRand=""; 
  
  for(int i=0; i<4; i++){
      String rand=String.valueOf(random.nextInt(10));
     
      // 將認證碼寫入到圖像中
      g.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
      
      g.drawString(rand,13*i+6,16);
  }

  // 將認證碼存入 xxxx 物件
     /* 未撰寫 */
	 


  // 釋放圖像資源
  g.dispose();
  
  // 輸出圖像到頁面
  ImageIO.write(image, "JPEG", response.getOutputStream());
  
%>
