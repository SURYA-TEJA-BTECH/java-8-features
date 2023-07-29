package in.surya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class User {

	Integer age;
	String name;

	public User(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

}

public class Streams {

	public static void main(String[] args) {

		
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter elements"); ArrayList<Integer> listt =new
		  ArrayList<>(); for (int i = 0; i < 5; i++) {
		  
		  listt.add(scanner.nextInt()); } System.out.println(listt);
		  
		 
		
		  List<Integer> list=Arrays.asList(20,30,10,55,64);
		  
		  Stream<Integer> stream = list.stream(); Stream<Integer> filteredStream =
		  stream.filter((i)->i>50); filteredStream.forEach(i->System.out.println(i));
		  
		  System.out.println("=================================");
		  list.stream().filter(i->i>18).forEach(i->System.out.println(i));
		  
		  List<String> names = Arrays.asList("john", "anu", "robert", "anajli");
		  names.stream().filter(name -> name.charAt(0) == 'a').forEach(i ->
		  System.out.println(i));
		  
		  
		 

		User user = new User(26, "janu");
		User user1 = new User(16, "keerthi");
		User user11 = new User(86, "januavi");
		User user111 = new User(36, "anu");
		User user1111 = new User(15, "anjali");
		Stream<User> stream1 = Stream.of(user, user1, user11, user111, user1111);
		List<User> list1 = Arrays.asList(user, user1, user11, user111, user1111);

		Stream.of(user, user1, user11, user111, user1111).filter(person -> person.age >= 18)
				.forEach(i -> System.out.println(i));

		Stream.of(user, user1, user11, user111, user1111).filter(person -> person.age >= 18)
				.filter(person -> person.name.charAt(0) == 'a').forEach(i -> System.out.println(i));// only works with
																									// and

		stream1.filter(person -> person.age >= 18 && person.name.charAt(0) == 'a').forEach(i -> System.out.println(i));

	}

}
