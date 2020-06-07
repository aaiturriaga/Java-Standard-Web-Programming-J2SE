package clase4;

public class Persona implements Saludable {

	public String nombre;
	public String apellido;
	public Integer edad;
	
	public Persona(String nombre, Integer edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}

	public Persona(String nombre,String apellido, Integer edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return this.nombre  + "hola como están?";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
