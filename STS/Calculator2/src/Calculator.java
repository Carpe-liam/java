import java.util.ArrayList;

class Calculator implements java.io.Serializable {

// member variables
	private ArrayList<Object> equation = new ArrayList<Object>();
	private double numOne;
	private double numTwo;
	private char operator;
	private double result;

	
// constructor
	public Calculator() {}
		
	
	
// methods
	public void performOperation() {
		if(this.operator == '+') {
			result = numOne + numTwo;
		} 
		if(this.operator == '-') {
			result = numOne - numTwo;
		}
		if(this.operator == '*') {
			result = numOne	* numTwo;
		}
		if(this.operator == '/') {
			result = numOne/numTwo;
		}
	}
	
	public void getResult() {
		System.out.println(result);
	}
	
		
	
// getters and setters
	public void setNumOne(double input) {
		numOne = input;
	}
	
	public void setNumTwo(double input) {
		numTwo = input;
	}
	
	public void setOperator(char input) {
		operator = input;
	}
	
	
	
	
	
	
	public void setEquation(Object input) {
		equation.add(input);
	}
	
	
	
	
	
}
