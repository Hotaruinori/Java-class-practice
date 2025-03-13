import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class ch32_4 extends Application {
	@Override 									// Override Application類別的start()
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane(); 		// 建立pane物件
		pane.getChildren().add(new Button("JavaFX"));	// 在pane物件內建立按鈕
		Scene scene = new Scene(pane, 300, 200); 		// 將pane物件放入scene
		primaryStage.setTitle("ch32_4"); 		// 設定stage標題
		primaryStage.setScene(scene); 			// 將scene放在stage
		primaryStage.show();  					// 顯示stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

