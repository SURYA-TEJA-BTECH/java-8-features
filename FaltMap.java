package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FaltMap {

	
public static void main(String[] args) {
	
	List<String> java= Arrays.asList("corejava","adv java","sbms");
	Stream<List<String>> of = Stream.of(java);
	of.forEach(s->System.out.println(s));
	List<String> ui = Arrays.asList("html","css","angualr");
	List<List<String>> coures = Arrays.asList(java,ui);
	System.out.println(coures);
	
	Stream<List<String>> stream = coures.stream();
	Stream<String> flatMap = stream.flatMap(s->s.stream());
	flatMap.forEach(s->System.out.println(s));
	
	
	
	
}
	
	
	
	
}
