package Lab1c3;

public class Comprador extends Persona {
	
	private Double Presupuesto;
	
	public Comprador(String Nombre, String Apellido, String NumeroDoc, Double presupuesto) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.numeroDoc = NumeroDoc;
		this.Presupuesto = presupuesto;
	}

	public Double getPresupuesto() {
		return Presupuesto;
	}

	public void setPresupuesto(Double presupuesto) {
		Presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Comprador [Nombre=" + Nombre +", Apellido=" + Apellido +", numeroDoc=" + numeroDoc +", Presupuesto=" + Presupuesto + "]";
	}
	
}
