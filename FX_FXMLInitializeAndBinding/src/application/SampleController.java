package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
	
	public Button button;
	public Label firstLabel; 
	
	//default no args constructor
	public SampleController(){
		
	}
	
	public void handleButtonClicks(){
		System.out.println("Running code from controller");
		button.setText("I've been clicked");
	}
	
	

}
