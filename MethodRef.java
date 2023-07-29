package in.surya;


@FunctionalInterface
interface MyInterfacee{
	public  abstract void   m1();
}

public class MethodRef {
	
	
	public static void m2() {
		System.out.println("this is m2 method");
	}
	
	
	public static void main(String[] args) {
		
	MyInterfacee mi=MethodRef::m2;
	mi.m1();
		
	
	
	Runnable r=()->System.out.println("hi");
	
	Thread thread = new Thread(r);
	thread.start();
	
	
	
	}
	
	
	
	
	
	

}
