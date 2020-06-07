package clase1;

import java.util.Scanner;

/*
 * Comentario Multilinea
 * @author iturriaga
 *
 *Se ingresas 3 notas
 *determinar:
 * la suma de las notas
 * promedio -> suma/cantidad
 * mayor -> cual de los 3 es mayor
 * menor -> cual de los 3 es menor
 * suma total -> sumar los tres valores
 * 
 */
public class Programa1 {
	
	//ctrl + space
	public static void main(String[] args) {
		
		//operadores aritmeticos
		
		int nota1, nota2, nota3;
		int cantidadNotas = 3;
		int mayor;
		int menor;
		int sumaNotas = 0; // 0 a 10
		float promedio = 0;
		
		//asignar los valores de las notas
		//leer desde el teclado las 3 notas
		Scanner teclado = new Scanner(System.in);
		
		
		
		//validacion con do while
		boolean valido = false;
		
		do {
			System.out.print("Ïngrese la 1er nota \t");
			String auxiliar =teclado.next();
			if(Integer.getInteger(auxiliar) !=null) {
				valido = true;
				}
		}while(!valido);
			
		//nota1=teclado.nextInt();
		
	}

}
