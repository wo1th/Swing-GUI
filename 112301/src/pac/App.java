package pac;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		while (true) {
			String a=scanner.next();
			if (a.equals("a")) {
			int x=random.nextInt(100);
			int y=random.nextInt(100);
			System.out.println(x);
			System.out.println(y);
		}
		}
		
		
	}

}
