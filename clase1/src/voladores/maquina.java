package voladores;

public abstract class maquina extends volador implements Aterrizable{
	
	protected boolean tieneTurbina;

	public maquina(String nombre) {
		super(nombre);
		this.tieneTurbina = true;
		// TODO Auto-generated constructor stub
	}

}
