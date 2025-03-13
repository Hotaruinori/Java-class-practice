import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class ch32_3 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new Button("JavaFX"), 300, 200);
		primaryStage.setTitle("ch32_3"); 		// 設定stage標題
		primaryStage.setScene(scene); 			// 將scene放在stage
		primaryStage.show();  					// 顯示stage

// 建立第2個stage		
		Stage stage = new Stage(); 				// 建立新的stage
		stage.setTitle("stage 2"); 				// 設定stage標題stage 2
		stage.setScene(new Scene(new Button("OK"), 200, 50));
		stage.show();
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

