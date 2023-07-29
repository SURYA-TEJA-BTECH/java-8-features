package in.surya;

import java.util.Optional;

public class OptionalClasss {

	public static Optional<String> findById(int id) {

		String name = null;
		if (id == 10) {
			name = "raju";
		} else if (id == 50) {
			name = "rani";
		}

		else if (id == 500) {
			name = "janu";
		}

		return Optional.ofNullable(name);

	}

	public static void main(String[] args) {
		
		int id=100;
		Optional<String> name = OptionalClasss.findById(id);
if(name.isPresent()) {
	System.out.println(name.get());
}else {
	System.out.println("no data");
}





	}

}
