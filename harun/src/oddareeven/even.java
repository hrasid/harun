package oddareeven;

import java.util.Scanner;

public class even {
public static void main(String[] args) {
	Scanner rasid= new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int a= rasid.nextInt();
	if(a%2==0)
	 System.out.println("GIVEN NUMBER IS EVEN NUMBER");
	else
		System.out.println("THE GIVEN IS NOT A EVEN NUMBER");
}
}
