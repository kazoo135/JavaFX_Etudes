import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
/*
 * This demo will take an input in a text field.
 * As the text field is being filled in  a label will
 * be updated to display the text being typed into 
 * the text field
 */

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
		window.setTitle("Real Time Update");
		
		
		
		VBox layout = new VBox();
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
		
	}

}
