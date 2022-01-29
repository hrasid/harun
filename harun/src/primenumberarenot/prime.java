package primenumberarenot;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	int temp;
	boolean isprime=true;
	Scanner rasid= new Scanner(System.in);
	System.out.println("ENTER ANY NUMBER");
	int num=rasid.nextInt();
	rasid.close();
	for(int i=2;i<=num/2;i++)
	{
	temp=num%i;
	if(temp==0)
	{
		isprime=false;
		break;	
	}
	}
if(isprime)
	System.out.println(num+"is a prime number");
else 
	System.out.println(num+"is not a prime number");
	
}
}