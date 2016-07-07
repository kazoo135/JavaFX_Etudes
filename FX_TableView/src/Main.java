import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

	//Get all the products, usually some kind of DB
	public ObservableList<Products> getProduct(){
		
		ObservableList<Products> products = FXCollections.observableArrayList();
		products.add(new Products("Gibson SG", 1500.00, 20));
		products.add(new Products("Gibson Les Paul", 2500.00, 10));
		products.add(new Products("Epiphone EX", 900.99, 40));
		products.add(new Products("Martin D100", 3050.67, 15));
		products.add(new Products("Martin D18", 4500.00, 8));
		
		return products; 
	}
	
	
	
	
}
