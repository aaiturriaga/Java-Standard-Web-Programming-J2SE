package voladores;

public class Avion extends maquina {

	public Avion(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/*public Avion(String nombre) {
		super(nombre, Boolean.TRUE);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public Estado aterrizar() {
		// TODO Auto-generated method stub
		System.out.println(this.nombre + "aterrizando");
		return new Estado(false, "todo en orden");
	}

}
