package ar.com.educacionit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParesMainStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> valores = Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11});
		
		List<Integer> valoresPares = new ArrayList<Integer>(valores.size());
		//java8
		Stream<Integer> paresStream = valores.stream();
		
		}

}
