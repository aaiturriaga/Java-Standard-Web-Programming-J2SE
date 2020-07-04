package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.DOC;

public class DOCFileParser extends FileParser<DOC> {

	private String rutaArchivo;
	
	public DOCFileParser(String rutaArchivo) {
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
	public DOC parse() {
		// TODO Auto-generated method stub
		return new DOC();
	}
	

}
