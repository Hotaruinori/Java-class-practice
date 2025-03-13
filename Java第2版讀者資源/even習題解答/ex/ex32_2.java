import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ex32_2 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		Pane pane = new HBox(10);						// HBox布局
		pane.setPadding(new Insets(5, 5, 5, 5));		// 上下左右邊界距離
		Image image = new Image("hung.gif");			// 圖檔
				
		ImageView iv2 = new ImageView(image);	// 建立iv2
		iv2.setFitHeight(50); 					// 設定高
		iv2.setFitWidth(50); 					// 設定寬
		
		pane.getChildren().add(iv2); 			// 加入iv2
		pane.getChildren().add(new ImageView(image)); 	// 加入image
		
		Scene scene = new Scene(pane); 			// 將pane物件放入scene
		primaryStage.setTitle("ex32_2"); 		// 設定stage標題
		primaryStage.setScene(scene); 			// 將scene放在stage
		primaryStage.show();  					// 顯示stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

