import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	Stage window; 
	TreeView<String> tree;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ListView Demo");
		
		//add root and tree branches
		TreeItem<String> root, Save, Print, Preferences;
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//Save
		Save = makeBranch("Save", root);
		makeBranch("Save File", Save);
		makeBranch("Save As", Save);
		
		//Print
		Print = makeBranch("Print", root);
		makeBranch("Print to file", Print);
		makeBranch("Print to PDF", Print);
		
		//Preferences
		Preferences = makeBranch("Preferences", root);
		makeBranch("Global", Preferences);
		makeBranch("Project", Preferences);
		
		//Create tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
				
		
		//layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		
		Scene scene = new Scene(layout, 300, 250);
		
		window.setScene(scene);
		window.show();
		
	}
	
	//make a branch on the tree
	

}
