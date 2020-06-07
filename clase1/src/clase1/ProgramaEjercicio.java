package clase1;

/*
 * Ejercicio #1
 * Construir un vector de enteros llamado vecNumeros e inicializarlo con los números 11, -22, 33, -44, 55,
 * -66, 77, -88, 99.
 * Acumular la suma de los valores positivos en una variable totalPositivos.
 * Acumular la suma de los valores negativos en una variable totalNegativos.
 * Imprimir en pantalla:
 * los valores de totalPositivos y totalNegativos
 * maximos
 * minimos
 * indice del minimo
 * indice del maximo
 * 
 * CTRL+SHIFT+F / Formatear text
 * 
 */

public class ProgramaEjercicio {

	public static void main(String[] args) {
		
		//genero mi vector
		int[] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
		
		//acumulador
		int totalPositivos = 0;
		int totalNegativos = 0;
		
		//maximos y minimos
		int maximo = 0;
		int minimo = 0;
		int indMax = 0;
		int indMin = 0;
		
		//Recorrer el vector
		for(int i=0; i < vecNumeros.length ; i++) {
			
			if(i==0) {
				maximo = vecNumeros[i];
				minimo = vecNumeros[i];
			}else {
				if(vecNumeros[i] < minimo) {
					minimo = vecNumeros[i];
					indMin = i;
				}
				if(vecNumeros[i] > maximo) {
					maximo = vecNumeros[i];
					indMax = i;
				}
			}
			if(vecNumeros[i] > 0) {
				totalPositivos += vecNumeros[i];
			}else {
				totalNegativos += vecNumeros[i];
			}
			
		}
		
		//Imprimir valores por consola
		System.out.println("Maximo "+maximo+". Indice = "+indMax);
		System.out.println("Minimo "+minimo+". Indice = "+indMin);
		System.out.println("Negativos acumulados "+totalNegativos);
		System.out.println("Positivos acumulados "+totalPositivos);
		
	}

}
