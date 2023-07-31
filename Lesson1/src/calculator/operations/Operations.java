package calculator.operations;



public class Operations {
	private double a;
	private double b;
	//public double divi;
	//String state = new String();
	public double add(double a,double b) {
		return this.a+this.b;
	}
	public double sub(double a,double b) {
		return this.a-this.b;
	}
	public double mult(double a,double b) {
		return this.a*this.b;
	}
	public double div(double a,double b) {
		try {
			return this.a/this.b;
		}catch (ArithmeticException e){
			double nothing =0;
			return nothing;
		}
	}
}
	


