package in.surya;

interface MyFunctionalInterface {
	public abstract void m1();

}

public class WithOutLambda implements MyFunctionalInterface {

	public void m1() {
		System.out.println("I am m1 method");
	}

	public static void main(String[] args) {
		// Creating an instance of the Test class
		WithOutLambda test = new WithOutLambda();

		// Calling the regular method m1()
		test.m1();

	}

}
