package Lab1c3;

public class Programa1 {

	public static void main(String[] args) {

		//Instancio un auto
		Auto Aut1 = new Auto(180, 170, 160, "Ford", "Mustang", "Azul");
		System.out.println(Aut1);
		
		//Instancio un comprador
		Comprador Comp1 = new Comprador("Ariel", "Iturriaga", "55.555.555", 18000D);
		System.out.println(Comp1);
		
		//Instancio un vendedor
		Vendedor Vend1 = new Vendedor("Alejandro", "Gomez", "44.444.444", 3);
		System.out.println(Vend1);

	}

}
