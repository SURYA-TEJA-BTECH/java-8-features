package in.surya;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public Boolean test(int i) {

		if (i > 10) {
			return true;
		} else {
			return false;
		}

	}
	
	
	public static void main(String[] args) {
		PredicateDemo predicateDemo = new PredicateDemo();
		Boolean result = predicateDemo.test(78);
		System.out.println(result);
		
		//using predicateminterface
	Predicate<Integer>	 p=(i)->i>10;  // just two lines are sufficeient
	System.out.println( p.test(78));
	System.out.println("=========================================================");	
	//bipredicate
	BiPredicate<Integer, Integer> bp=(i,j)->(i+j)>=60;
	System.out.println( bp.test(30, 193));
	
		
	}
	
	
	

}
