package Lab1c4;

public abstract class Persona {
	
	protected Integer id;
	protected String nombre;
	protected String apellido;
	protected Telefono telefono;
	protected Domicilio domicilio;
	
	public Persona(Integer id, String nombre, String apellido, Telefono telefono, Domicilio domicilio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}
		
	public Persona() {
		
	}

	public String getNombreCompleto() {
		
		char[] cnom = this.nombre.toCharArray();
		char[] cape = this.apellido.toCharArray();
		
		if (nombre != null) {
			
			String nombreMinuscula = nombre.substring(1,nombre.length()).toLowerCase();
			String nombreMayusculas = nombre.substring(0,1).toUpperCase();	
		}
				
		for (int i = 0; i < cnom.length ; i++) {
			
			if (i != 0) {
				
				cnom[i]=Character.toLowerCase(cnom[i]);
				
			}else {
				
				cnom[i]=Character.toUpperCase(cnom[i]);
				
			}
			
		}
		
		for (int i = 0; i < cape.length ; i++) {
			
			if (i != 0) {
				
				cape[i]=Character.toLowerCase(cape[i]);
				
			}else {
				
				cape[i]=Character.toUpperCase(cape[i]);
				
			}

		}
		
		this.nombre = new String(cnom);
		this.apellido = new String(cape);
			
		return this.nombre + ", " + this.apellido;

	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", domicilio=" + domicilio + "]";
	}

}
