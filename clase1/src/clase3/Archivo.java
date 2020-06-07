package clase3;

public class Archivo {
	
	protected String tipo;
	
	protected long tamanio;
	
	protected String nombre;
	
	public Archivo() {
		
	}
	
	public Archivo(String tipo, long tamanio, String nombre) {
		
		this.tipo = tipo;
		this.tamanio = tamanio;
		this.nombre = nombre;
		
	}

	public String toString() {
		return "Archivo tipo tamanio nombre";
	}
	
	//ALT SHIF S
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getTamanio() {
		return tamanio;
	}

	public void setTamanio(long tamanio) {
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	

}
