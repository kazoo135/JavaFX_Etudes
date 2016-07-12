import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("FX Binding Properties Demo");
		
		//Binding y to x
		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();
		y.bind(x.multiply(10));
		
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue());
		
		x.setValue(8);
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue());
		
		Button submit = new Button("Submit");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(submit);
		
		Scene scene = new Scene(layout, 400, 250);
		window.setScene(scene);
		window.show();
		
	}

}
