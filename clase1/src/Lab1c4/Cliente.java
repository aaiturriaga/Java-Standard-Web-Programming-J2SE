package Lab1c4;

public class Cliente extends Persona {
	
	protected Integer numeroCliente;

	public Cliente(Integer id, String nombre, String apellido, Telefono telefono, Domicilio domicilio,
			Integer numeroCliente) {
		super(id, nombre, apellido, telefono, domicilio);
		this.numeroCliente = numeroCliente;
	}

	public Cliente() {
		
	}
	
	@Override
	public String toString() {
		return "Cliente [numeroCliente=" + numeroCliente + ", id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
	}
	
}
