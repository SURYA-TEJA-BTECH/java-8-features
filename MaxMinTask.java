package in.surya;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Empp {

	String name;
	Double salary;
	String country;

	public Empp(String name, Double salary,String country) {
		super();
		this.name = name;
		this.salary = salary;
		this.country=country;
	}

	@Override
	public String toString() {
		return "Empp [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}

public class MaxMinTask {
	
	
	
	public static void main(String[] args) {

		Empp empp1 = new Empp("surya", 60000.0, "India");
		Empp empp2 = new Empp("janu", 68000.0, "India");
		Empp empp3 = new Empp("keerthi", 860000.0, "USA");
		Empp empp4 = new Empp("yogi", 960000.0, "UK");
		Empp empp5 = new Empp("karan", 560000.0, "India");
		Empp empp6 = new Empp("raji", 670000.0, "USA");

		
	
	List<Empp> list = Arrays.asList(empp1,empp2,empp3,empp4,empp5,empp6);
	Stream<Empp> stream = list.stream();
 Optional<Empp> collect = stream.collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));

	 System.out.println("max salary::"+collect.get().name);

	 Optional<Empp> min =list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));

	 System.out.println("min salary::"+min.get().name);	
	
	Double avgSalary = list.stream().collect(Collectors.averagingDouble(emp->emp.salary));
	System.out.println(avgSalary);
	
	Map<String, List<Empp>> map = list.stream().collect(Collectors.groupingBy(e->e.country));
	System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
