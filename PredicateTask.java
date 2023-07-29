
package in.surya;

import java.util.function.Predicate;

public class PredicateTask {

	public static void main(String[] args) {

		String[] names = { "Anuska", "kalyanipriadarshini", "kaju", "janu", "Anjali" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}

		}

	}

}
