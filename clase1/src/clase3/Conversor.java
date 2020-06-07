package clase3;

//clase
public final class Conversor {
	
	//atributo
	
	//metodos
	
	public static Archivo convertir(Archivo source) {
		
		//alguna libreria que convierta
		return new TXT(source.getNombre(),source.getTamanio());
		
		
	}

}
