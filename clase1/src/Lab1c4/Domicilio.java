package Lab1c4;


public class Domicilio {
	
	protected Integer id;
	protected String calle;
	protected String localidad;
	protected Integer numero;
	
	public Domicilio(Integer id, String calle, String localidad, Integer numero) {
		super();
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.numero = numero;
	}

	public Domicilio() {
		
	}
	
	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", calle=" + calle + ", localidad=" + localidad + ", numero=" + numero + "]";
	}

	
	
}
