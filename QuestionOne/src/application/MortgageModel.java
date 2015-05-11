package application;

import javafx.scene.control.ComboBox;

public class MortgageModel {
	
	public double getGrossIncome() {
		return grossIncome;
	}

	public void setGrossIncome(double grossIncome) {
		this.grossIncome = grossIncome;
	}

	public double getMonthlyDebt() {
		return monthlyDebt;
	}

	public void setMonthlyDebt(double monthlyDebt) {
		this.monthlyDebt = monthlyDebt;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	private double grossIncome;
	private double monthlyDebt;
	private double interestRate;
	private int term;
	private double downPayment;

	// default constructor
	public MortgageModel() {
	}

	public MortgageModel(double grossIncome, double monthlyDebt, double interestRate, int term) {
		this.grossIncome = grossIncome;
		this.monthlyDebt = monthlyDebt;
		this.interestRate = interestRate;
		this.term = term;
		
		this.downPayment = 0;
	}
	
	
	
}