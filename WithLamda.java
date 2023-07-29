package in.surya;

@FunctionalInterface
interface MyInterface {
	public abstract void m1();
}

public class WithLamda {

	public static void main(String[] args) {

		MyInterface mi = () -> System.out.println("m1 methhod is called");
		mi.m1();

	}

}
