package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Personn {
	String name;
	String country;

	public Personn(String name, String country) {
		this.name = name;
		this.country = country;

	}

	@Override
	public String toString() {
		return "Personn [name=" + name + ", country=" + country + "]";
	}
	
	
	

}

public class MatchingOperations {

	public static void main(String[] args) {
		Personn p1 = new Personn("John", "USA");
		Personn p2 = new Personn("Steve", "JAPAN");
		Personn p3 = new Personn("Ashok", "INDIA");
		Personn p4 = new Personn("janu", "INDIA");
		Personn p5 = new Personn("Ching", "CHINA");
		List<Personn> persons = Arrays.asList(p1, p2, p3, p4, p5);

		boolean anyMatch = persons.stream().anyMatch(person -> person.country.equals("INDIA"));
		System.out.println("is there any person belongs to INDIA ? ::" + anyMatch);

		persons.stream().filter(person -> person.country.equals("INDIA"))
				.forEach(i -> System.out.println(i.toString()));
		 List<Personn> list2 = persons.stream().filter(person -> person.country.equals("INDIA")).toList();
	
		for (Personn personn : list2) {
			System.out.println(personn);
		}
		
	List<String> names = persons.stream().filter(person -> person.country.equals("INDIA")).map(person->person.name).toList();
	System.out.println(names);
			

	}
}
