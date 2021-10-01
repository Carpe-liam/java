import java.io.Serializable;

class Calculator implements Serializable {
// member variables
	private double operandOne;
	private double operandTwo;
	private char operator;
	private double result;

// constructor
	public Calculator() {}

// methods
	public void performOperation() {
		if(this.operator == '+') {
			result = operandOne + operandTwo;
		} 
		if(this.operator == '-') {
			result = operandOne - operandTwo;
		}
	}
	
	public void getResults() {
		System.out.println(result);
	}

// getters and setters
	public void setOperandOne(double val) {
		operandOne = val;
	}

	public void setOperandTwo(double val) {
		operandTwo = val;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
}
