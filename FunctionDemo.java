package in.surya;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	
	
	
	
	
public static void main(String[] args) {
	
	Function<String, Integer> f =(name)->name.length();
	System.out.println(f.apply("janu"));
	System.out.println(f.apply("surya"));
	
	
	
	
	BiFunction<Integer, Integer, Double> bf=(a,b)->(double)(a+b);
	System.out.println(bf.apply(4, 9));
}








}
