package ar.com.educacionit.generics.enums;

//Es inmutable, no se puede modificar nada luego de instanciarlo

public enum FileTypeEnum {

	//defino los enums
	CSV("txt"),DOC("txt"),TXT("txt");
	
	private String type;
	
	private FileTypeEnum(String type) {
		this.type=type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
