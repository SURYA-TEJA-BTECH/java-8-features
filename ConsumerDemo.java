package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c = name -> System.out.println(name + " good night");
		c.accept("janu");
		c.accept("kerthi");
		
		
		List<Integer> numbers = Arrays.asList(10,20,30);
		numbers.forEach(i->System.out.println(i));
		
		
		
		BiConsumer<String, String> bc=(a,b)->System.out.println(a + "," +b +" are best friends");
		bc.accept("surya", "keerthi");
		
		
		
		
		
		
		
		
		
		
		

	}
}
