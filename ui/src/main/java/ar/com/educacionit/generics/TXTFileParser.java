package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.TXT;

public class TXTFileParser extends FileParser<TXT> {

	private String rutaArchivo;
	
	public TXTFileParser(String rutaArchivo) {
		super();
		this.rutaArchivo = rutaArchivo;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	@Override
	public TXT parse() {
		// TODO Auto-generated method stub
		return new TXT();
	}
	
}


