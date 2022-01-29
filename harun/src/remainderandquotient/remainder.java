package remainderandquotient;

import java.util.Scanner;

public class remainder {
public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("ENTER U R DIVIDER");
	int divider= reader.nextInt();
	System.out.println("ENTER U R DIVISOR");
	int divisor= reader.nextInt();
	int quotient=divider/divisor;
	int remainder=divider%divisor;
	System.out.println("THE QUOTIENT FOR THE GIVEN VALUE IS"+quotient);
	System.out.println("THE REMAINDER FOR THE GIVEN VALUE IS"+remainder);
}
}
