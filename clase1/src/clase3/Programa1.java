package clase3;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tipo = "TXT";
		Long tamanio = 1000L;
		String nombre = "file";
		
		Archivo a = new Archivo();
		
		a.setNombre(nombre);
		
		a.setTamanio(tamanio);
		
		a.setTipo(tipo);
		
		System.out.println(a);
		
		if("MP3".equals(a.getTipo())) {
			
			a = Conversor.convertir(a);
			
		}
		
	}

}
