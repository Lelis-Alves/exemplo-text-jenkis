

public class ConcatenarString {

	public static String concatenar(String a, String b) {
		return a += b;

	}


	public static void main(String[] args) {

		String total = concatenar("a","b");

		System.out.println(total);

	}

}