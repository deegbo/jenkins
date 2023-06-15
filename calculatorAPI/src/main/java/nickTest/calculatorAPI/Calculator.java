package nickTest.calculatorAPI;

public class Calculator {
	int result;
	//Method for addition
	public int add(int num1, int num2){
		result = num1+num2;
		return result;
	}
	//Method for subtraction
	public int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public int multiply(int num1, int num2){
		result = num1*num2;
		return result;
	}
	//Method for division
	public float divide(int num1, int num2){
		result = num1/num2;
		return result;
	}
	// Method for Percentage of a number
	public float percent(int constant, int num1, int num2) {
		constant= 100;
		result = Math.round(num1/constant)*num2-num2;
		return result;
	}
}