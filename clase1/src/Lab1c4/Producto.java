package Lab1c4;

public class Producto {
	
	protected Integer id;
	protected Double precio;
	protected String descripcion;

	public Producto(Integer id, Double precio, String descripcion) {
		super();
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	public Producto() {
		
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}

	
}
