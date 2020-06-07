package clase2;

public abstract class Buscador {
	
	protected String clave;
	
	public Buscador(String clave) {
		this.clave = clave;
	}
	
	public Resultado[] buscar() {
		
		String sql = "SELECT * FROM ARTICULOS WHERE TITULO LIKE '%"+ this.clave+ "%'";
		
		Resultado result1 = new Resultado("sarasa A","Figueroa 1",679F, true);
		Resultado result2 = new Resultado("sarasa B","Figueroa 2",679F, true);
		Resultado result3 = new Resultado("sarasa C","Figueroa 3",679F, true);
		
		Resultado[] resultados = {result1,result2,result3};
		return resultados;
				
	}
	
	//List(Resultado)
	
}
