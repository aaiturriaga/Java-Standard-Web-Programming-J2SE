package delProfe;

public abstract class Buscador {

	protected String clave;

	public Buscador(String clave) {
		this.clave = clave;
	}

	public abstract Resultado[] buscar();
}