package Lab1c4;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Telefono telcli = new Telefono(1, "CEL", "11111111");
		
		Domicilio domcli = new Domicilio(1, "Avenida por acá", "CABA", 3321);
		
		Cliente cli = new Cliente(2, "aRIeL", "iTURRiAGA", telcli, domcli, 1234);
				
		Producto pro = new Producto(12, 238.23D, "Balanza");
		
		System.out.println(telcli);
		System.out.println(domcli);
		System.out.println(cli);
		System.out.println(pro);
		
		System.out.println(cli.getNombreCompleto());

				
	}

}
