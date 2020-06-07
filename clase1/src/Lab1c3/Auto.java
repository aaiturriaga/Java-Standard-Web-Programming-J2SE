package Lab1c3;

public class Auto extends Vehiculo {
	
	private String Marca;
	private String Modelo;
	private String Color;
	
	public Auto(Integer alto, Integer ancho, Integer largo, String marca, String modelo, String color) {
		super(alto, ancho, largo);
		Marca = marca;
		Modelo = modelo;
		Color = color;
	}

	@Override
	public String toString() {
		return "Auto [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Largo=" + Largo + ", Ancho=" + Ancho + ", Alto=" + Alto + " ]";
	}

	
	
}
