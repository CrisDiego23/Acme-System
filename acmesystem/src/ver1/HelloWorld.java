package ver1;
import java.util.Scanner;

public class HelloWorld {
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static String whatFor(Scanner scanner) {
		System.out.print("Enter a word: ");
		String inputWord = scanner.next();
		String subject = inputWord + " stringArg, what for?";
		return subject;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello from Eclipse");
		System.out.println("Dave is working locally on his branch");
		heyNow();
		String words = whatFor(scnr);
		System.out.println(words);
		scnr.close();
	}

}
