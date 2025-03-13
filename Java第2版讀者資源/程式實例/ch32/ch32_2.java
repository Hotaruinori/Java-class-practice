import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class ch32_2 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		Button btn = new Button("JavaFX");
		Scene scene = new Scene(btn, 300, 200);
		primaryStage.setTitle("ch32_2"); 		// 設定stage標題
		primaryStage.setScene(scene); 			// 將scene放在stage
		primaryStage.show();  					// 顯示stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

