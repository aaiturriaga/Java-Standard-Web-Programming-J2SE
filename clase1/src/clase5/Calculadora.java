package clase5;

public class Calculadora {
	
	private double a;
	private double b;
	
	public Calculadora(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public double dividir(int a, int b) {

		try {
			//codigo sin falla
			long c = a/b;
			return c;
		}catch(ArithmeticException e) {
			//tipo de excecion entre los () del try
			//codigo de control, cuando falla
			System.out.println(e.getMessage());
			return -1;
		}
	
	}	
	
	public double dividir() {
		return (int)a / (int)b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
