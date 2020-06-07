package clase4;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//la que usa SPRING, Hibernate, etc
		Saludable carlos = new Persona("Carlos", 34);
		Persona ariel = new Persona("Ariel", 34);
		//Casteo
		Persona pCarlos = (Persona)carlos;
		pCarlos.getEdad();
		//Casteo
		((Persona)carlos).getEdad();
		
		
		ariel.getEdad();
		carlos.saludar();
		ariel.saludar();
		
	}

}
