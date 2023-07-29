package in.surya;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	private String name;
	private String location;
	private String dept;

	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", dept=" + dept + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}

public class PredicateJoining {

	public static void main(String[] args) {

		Employee employee1 = new Employee("janu", "hyd", "db");
		Employee employee2 = new Employee("keerthi", "eluru", "devops");
		Employee employee3 = new Employee("anu", "hyd", "testing");

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3);

		Predicate<Employee> p1 = employe -> employe.getLocation().equals("hyd");
		Predicate<Employee> p2 = employe -> employe.getDept().equals("db");

		Predicate<Employee> predicate = p1.or(p2);

		for (Employee employee : employees) {
			if (predicate.test(employee)) {

				System.out.println(employee);
			}

		}

	}

}
