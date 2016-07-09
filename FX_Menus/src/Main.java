import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	BorderPane layout;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("FX Menu Demo");
		
		layout = new BorderPane();
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();
		
	}

}
