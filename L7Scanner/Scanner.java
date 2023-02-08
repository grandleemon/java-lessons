package L7Scanner;

import java.util.Scanner;

class ScannerClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("string");
		String str = s.nextLine();
		System.out.println("int");
		int x = s.nextInt();

		System.out.println(str);
		System.out.println(x);
	}
}
