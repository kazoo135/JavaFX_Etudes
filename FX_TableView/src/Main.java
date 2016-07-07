import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage; 
		window.setTitle("FX TableView Demo");
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll();
		
		Scene scene = new Scene(layout, 300, 400);
		window.setScene(scene);
		window.show();
	}

}
