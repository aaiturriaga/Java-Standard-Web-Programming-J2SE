package Lab1c3;

public class Vendedor extends Persona {
	
	protected Integer cantAutosVendidos;
	
	public Vendedor(String Nombre, String Apellido, String NumeroDoc,Integer cantAutosVendidos) {
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.numeroDoc = NumeroDoc;
		this.cantAutosVendidos = cantAutosVendidos;
	}

	public Integer getCantAutosVendidos() {
		return cantAutosVendidos;
	}

	public void setCantAutosVendidos(int cantAutosVendidos) {
		this.cantAutosVendidos = cantAutosVendidos;
	}

	@Override
	public String toString() {
		return "Vendedor [Nombre=" + Nombre +", Apellido=" + Apellido +", numeroDoc=" + numeroDoc +", cantAutosVendidos=" + cantAutosVendidos + "]";
	}

}
