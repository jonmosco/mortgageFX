package application;
	
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private AnchorPane MortgageInputOverview;
	
	public MainApp() {
	}
	
	@Override
	public void start(Stage primaryStage) {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Mortage Estimator");

			showMortgageInputOverview();
	}
	
	public void showMortgageInputOverview() {
	    try {
	        // Load person overview.
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(MainApp.class.getResource("MortgageInput.fxml"));
	        MortgageInputOverview = loader.load();

	        // Set person overview into the center of root layout.
	        //rootLayout.setCenter(MortgageInput);
	        Scene scene = new Scene(MortgageInputOverview);
	        primaryStage.setScene(scene);
	        //primaryStage.setMain(this);
	  
	        
	        // Give the controller access to the main app.
	        MortgageEstimatorController controller = loader.getController();
	        controller.setMainApp(this);
	        
	        primaryStage.show();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}

}