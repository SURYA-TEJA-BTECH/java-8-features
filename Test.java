package in.surya;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1577, 27, 255, 97, 9);

		// Collections.sort(list);
		Collections.sort(list, (i, j) -> i.compareTo(j));
		System.out.println("Sorted list: " + list);

		Comparator<Integer> c = (i, j) -> i.compareTo(j);
		int result = c.compare(100, 20);
		System.out.println(result);

	}

}
