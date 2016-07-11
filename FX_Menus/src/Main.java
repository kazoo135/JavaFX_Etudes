import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
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
		MenuItem newFile = new MenuItem("New");
		newFile.setOnAction( e -> System.out.println("Creat new file"));
		fileMenu.getItems().add(newFile);
		
		MenuItem openFile = new MenuItem("Open File");
		openFile.setOnAction( e -> System.out.println("Open a File"));
		fileMenu.getItems().add(openFile);
		//add a category separator
		fileMenu.getItems().add(new SeparatorMenuItem());
		
		//close options
		MenuItem closeFile = new MenuItem("Close");
		closeFile.setOnAction( e -> System.out.println("Close a file" ));
		fileMenu.getItems().add(closeFile);
		fileMenu.getItems().add(new MenuItem("Close All"));
		fileMenu.getItems().add(new SeparatorMenuItem());
		
		//Save options
		fileMenu.getItems().add(new MenuItem("Save"));
		fileMenu.getItems().add(new MenuItem("Save As..."));
		fileMenu.getItems().add(new MenuItem("Save All"));
		fileMenu.getItems().add(new MenuItem("Revert"));
		
		//edit menu
		Menu editMenu = new Menu("_Edit");
		//add items to edit menue
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		editMenu.getItems().add(new MenuItem("Paste"));
		
		MenuItem redo = new MenuItem("Redo");
		redo.setOnAction( e -> System.out.println("Do Over"));
		redo.setDisable(true);
		editMenu.getItems().add(redo);
		
		
		
		//Main menu bar
		MenuBar menubar = new MenuBar();
		menubar.getMenus().addAll(fileMenu, editMenu);
		
		layout = new BorderPane();
		layout.setTop(menubar);
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
		
	}

}
