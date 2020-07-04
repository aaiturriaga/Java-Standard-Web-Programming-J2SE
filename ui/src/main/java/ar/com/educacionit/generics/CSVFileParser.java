package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.CSV;

public class CSVFileParser extends FileParser<CSV> {

	private String rutaArchivo;
	
	
	public CSVFileParser(String rutaArchivo) {
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
	public CSV parse() {
		// TODO Auto-generated method stub
		return new CSV();
	}

}
