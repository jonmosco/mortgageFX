package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MortgageEstimatorController {
		
	@FXML
	private TextField grossIncome;
	
	@FXML
	private TextField monthlyDebt;
	
	@FXML
	private TextField interestRate;
	
	@FXML
	//private TextField term;
	private ChoiceBox<Integer> term;
	
	@FXML
	private TextField downPayment;
	
    // Reference to the main application
    private MainApp mainApp;
    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

    }
    
	// constructor
	public MortgageEstimatorController() {
	}
	
	// set values to zero
	public void initialize() {
		grossIncome.setText("0");
		monthlyDebt.setText("0");
		interestRate.setText("0");
		downPayment.setText("0");
	}
	
	@FXML
	private void mortgageEstimates() {
		
	}
	
}