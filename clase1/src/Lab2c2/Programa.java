package Lab2c2;

public class Programa {

	public static void main(String[] args) {
		
		//Instanci Persona
		Persona Persona = new Persona();
		
		//Le doy valores a sus atributos
		Persona.Nombre = "Maria Jose";
		Persona.Apellido = "Gomez";
		Persona.Domicilio = new Domicilio("Independencia", 2236, "Ciudad Autónoma de Buenos Aires");
		
		//Imprimo valores
		System.out.println("Nombre: "+Persona.Nombre);
		System.out.println("Apellido: "+Persona.Apellido);
		System.out.println("Domicilio Calle: "+Persona.Domicilio.Calle);
		System.out.println("Domicilio Número: "+Persona.Domicilio.Numero);
		System.out.println("Domicilio Localidad: "+Persona.Domicilio.Localidad);

	}

}
