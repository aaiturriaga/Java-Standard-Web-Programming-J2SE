package Lab1c3;

public class Vehiculo {
	
	protected Integer Alto;
	protected Integer Ancho;
	protected Integer Largo;
	
	public Vehiculo(int alto, Integer ancho, Integer largo) {
		super();
		Alto = alto;
		Ancho = ancho;
		Largo = largo;
	}

	public Integer getAlto() {
		return Alto;
	}
	public void setAlto(Integer alto) {
		Alto = alto;
	}
	public Integer getAncho() {
		return Ancho;
	}
	public void setAncho(Integer ancho) {
		Ancho = ancho;
	}
	public Integer getLargo() {
		return Largo;
	}
	public void setLargo(Integer largo) {
		Largo = largo;
	}
	
	
}
