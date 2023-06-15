package nickTest.calculatorAPI;

public class CalculatorVO {
	private int firstNumber;
	private int secondNumber;
	private int constantNumber = 100;
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public int getConstant() {
		return constantNumber;
	}
	public void setConstant(int constantNumber) {
		this.constantNumber = 100;
	}
}
