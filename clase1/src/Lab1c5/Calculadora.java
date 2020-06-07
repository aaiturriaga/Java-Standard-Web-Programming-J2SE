package Lab1c5;

public class Calculadora {

	public int sumar(int a, int b) throws FueraRangoException {
		if(a<0 || a>1000) {
			throw new FueraRangoException("El valor "+ a +"fuera de rango");
		}

		if(b<0 || b>1000) {
			throw new FueraRangoException("El valor "+ a +"fuera de rango");
		}
		return a+b;
	}
	
	public int restar(int a, int b) throws FueraRangoException {
		if(a<0 || b<0) {
			throw new FueraRangoException("Algun valor es menor a cero");
		}

		if((b - a) < 0) {
			throw new FueraRangoException("La resta de "+ a + "y " + b +"es menor a cero");
		}
		return a-b;
	}
	
}
