package inputanumber;

import java.util.Scanner;

public class inputanumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO EXCUTE");
		int number= reader.nextInt();
		System.out.println("THE NUMBER YOU ENTERED IS "+number);
	reader.close();
	}

}
