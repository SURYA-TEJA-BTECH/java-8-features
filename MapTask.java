package in.surya;

import java.util.stream.Stream;

class Emp {

	String name;
	Integer age;
	Double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Emp(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


}

public class MapTask {


	public static void main(String[] args) {

		Emp emp1 = new Emp("surya", 21, 100000.0);
		Emp emp2 = new Emp("janu", 21, 1000000.0);
		Emp emp3 = new Emp("keerhi", 21, 1000.0);
		Emp emp4 = new Emp("ramya", 21, 50000.0);
		Emp emp5= new Emp("yogi", 21, 70000.0);
		
		Stream<Emp> stream = Stream.of(emp1,emp2,emp3,emp4,emp5);
	//	stream.filter(emp->emp.salary>=50000).map(emp->emp.name+" "+emp.age).forEach(i->System.out.println(i));//with map
		stream.filter(emp->emp.salary>=50000).forEach(emp->System.out.println(emp.name+" "+emp.age));//without mao
		
		
		
		
		
	}
}
