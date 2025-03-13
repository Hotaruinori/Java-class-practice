import javafx.application.Application;
import javafx.stage.Stage;

public class ch32_1 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		primaryStage.setTitle("ch32_1"); 		// 設定stage標題
		primaryStage.show();  					// 顯示stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

