package dowhile;

import java.util.Scanner;

public class loop {
public static void main(String[] args) {
	int x;
	Scanner rasid= new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF X");
	 x=rasid.nextInt();
	 
	do
	{
		System.out.print("value of x:"+x);
		x++;
		System.out.println("\n");
	}while(x<11);
}
}
