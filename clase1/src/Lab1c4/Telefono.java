package Lab1c4;

public class Telefono {
	
	protected Integer id;
	protected String tipo;
	protected String numero;
	
	public Telefono(Integer id, String tipo, String numero) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}

	public Telefono() {
		
	}
	
	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
	
}
