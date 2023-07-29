package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {

	private Integer age;
	private String name;

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public Person(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class PredicateTaskk {

	
	
	public static void main(String[] args) {
		Person p1 = new Person(31, "janu");
		Person p2 = new Person(26, "kerthi");
		Person p3 = new Person(6, "kerthina");
		List<Person> persons = Arrays.asList(p1,p2,p3);
		
		Predicate<Person> p=person->person.getAge()>=18;
		
		for (Person person : persons) {
			
			if (p.test(person)) {
				System.out.println(person);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
