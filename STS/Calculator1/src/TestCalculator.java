
public class TestCalculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setOperandOne(10.5);
		calc.setOperator('+');
		calc.setOperandTwo(5.2);
		calc.performOperation();
		calc.getResults();
		
		
	}
}
