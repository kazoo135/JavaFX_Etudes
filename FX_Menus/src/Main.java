import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
		// File menu
		Menu fileMenu = new Menu("File");
		
		//menu items
		fileMenu.getItems().add(new MenuItem("New"));
		fileMenu.getItems().add(new MenuItem("Open File"));
		fileMenu.getItems().add(new MenuItem("Close"));
		
		//Main menu bar
		MenuBar menubar = new MenuBar();
		menubar.getMenus().add(fileMenu);
		
		layout = new BorderPane();
		layout.setTop(menubar);
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
		
	}

}
