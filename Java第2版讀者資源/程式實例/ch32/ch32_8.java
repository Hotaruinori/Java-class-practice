import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
public class ch32_8 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		
		Circle circle = new Circle(); 			// 建立Circle物件
		circle.setCenterX(150); 				// 設定圓中心x座標
		circle.setCenterY(100); 				// 設定圓中心y座標
		circle.setRadius(50);					// 圓半徑
		circle.setStroke(Color.BLUE); 			// 圓外框藍色
		circle.setFill(Color.YELLOW); 			// 圓內部填上黃色
		
		pane.getChildren().add(circle);			// 在pane物件內建立circle	
		
		Label label = new Label("Java"); 		// 建立標籤
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
		pane.getChildren().add(label); 			// 將標籤加入pane
				
		Scene scene = new Scene(pane, 300, 200); 	// 將pane物件放入scene
		primaryStage.setTitle("ch32_8"); 		// 設定stage標題
		primaryStage.setScene(scene); 			// 將scene放在stage
		primaryStage.show();  					// 顯示stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

