package in.surya;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("surya");
		sj.add("teja");

		System.out.println(sj);

		StringJoiner sj2 = new StringJoiner("  ", "(", ")");

		sj2.add("surya");
		sj2.add("teja");

		System.out.println(sj2);

	}

}
