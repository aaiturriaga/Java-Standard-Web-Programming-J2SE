package clase1;

import java.util.Scanner;

/*
 * Comentario Multilinea
 * @author iturriaga
 *
 *Se ingresas 3 notas
 *determinar:
 * promedio -> suma/cantidad
 * mayor -> cual de los 3 es mayor
 * menor -> cual de los 3 es menor
 * suma total -> sumar los tres valores
 * 
 */

public class Programa2 {
	
	//ctrl + space
		public static void main(String[] args) {
			
			//operadores aritmeticos
			
			int nota1, nota2, nota3;
			int cantidadNotas = 3;
			int mayor = 0;
			int menor = 0;
			int sumaNotas = 0; // 0 a 10
			float promedio = 0;
			
						//leer desde el teclado las 3 notas
			Scanner teclado = new Scanner(System.in);
			
			//asignar los valores de las notas
			nota1 = validarNota(teclado, "primer");
			nota2 = validarNota(teclado, "segunda");
			nota3 = validarNota(teclado, "tercer");
			
			//suma de las notas
			sumaNotas = nota1 + nota2 + nota3;
			
			//promedio
			promedio = sumaNotas / cantidadNotas;
			
			//mayor
			if(nota1 >= nota2 && nota1 >= nota3) {
				mayor = nota1;
			}
			if(nota2 >= nota1 && nota2 >= nota3) {
				mayor = nota2;
			}
			if(nota3 >= nota2 && nota3 >= nota1) {
				mayor = nota3;
			}
			
			//menor
			if(nota1 <= nota2 && nota1 <= nota3) {
				menor = nota1;
			}
			if(nota2 <= nota1 && nota2 <= nota3) {
				menor = nota2;
			}
			if(nota3 <= nota2 && nota3 <= nota1) {
				menor = nota3;
			}
			
			//mostrar datos en consola
			System.out.println("La suma de las notas es "+sumaNotas);
			System.out.println("El promedio de las notas es "+promedio);
			System.out.println("El mayor de las notas es "+mayor);
			System.out.println("El menor de las notas es "+menor);
			
		}

		private static int validarNota(Scanner teclado, String text) {
			int nota = 0;
			//validacion con do while
			boolean valido = false;
			
			do {
				System.out.print("Ïngrese la "+ text +" nota \t");
				String auxiliar =teclado.next();
				try {
					nota = Integer.parseInt(auxiliar);
					valido = true;
				} catch (Exception e) {
					// TODO: handle exception
					valido = false;
				}
			}while(!valido);
			
			return nota;
		}

}
