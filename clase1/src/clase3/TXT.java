package clase3;

public class TXT extends Archivo {
	
	public TXT() {
		
		this.tipo = "TXT";
		
	}
	
	public TXT(String nombre, Long tamanio) {
		//porque hereda de archivo
		//super();
		//setNombre(nombre);
		//setTamanio(tamanio);
		
		this.nombre = nombre;
		this.tamanio=tamanio;
		this.tipo= "TXT";
		
	
	}

}
