package clase5;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora cal = new Calculadora(100,0);
		
		double res = cal.dividir();
		
		System.out.println("La división es: "+ res);
		
		res = cal.dividir(1, 0);
		
		System.out.println("La división es: "+ res);
	
	}

}
