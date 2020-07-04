package ar.com.educacionit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> valores = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11});
		
		List<Integer> valoresPares = new ArrayList<Integer>(valores.size());

		//imperativa
		
		for(Integer valor : valores) {
			if(valor %2 == 0) {
				valoresPares.add(valor);
			}
			
		}
		System.out.println(valoresPares);
	}

}
