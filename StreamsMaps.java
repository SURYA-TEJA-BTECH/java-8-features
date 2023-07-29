package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsMaps {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("India", "uk", "canda", "pk","Ireland");
/*we are using map it is used to transform the data
	map takes the Funcation as the parameter and returns a stream	
*/		Stream<String> stream = list.stream();
		Stream<String> map = stream.map(name -> name.toUpperCase());
		map.forEach(i -> System.out.println(i));
		list.stream().map(name -> name.toLowerCase()).forEach(i -> System.out.println(i));

		
		
		list.stream().mapToInt(n->n.length()).forEach(i->System.out.println(i));
		
		
		//print name of the country with its lenth staring leter in country name is "I"
		
		
		list.stream().filter(n->n.charAt(0)=='I').map(n->n +" "+n.length()).forEach(i->System.out.println(i));
		
		
		
		
		
		
	}

}
