package reverseanumber;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	int num=0;
	
int reversenum=0;
System.out.println("ENTER YOUR INPUT AND PRESS OK");
Scanner rasid= new Scanner(System.in);
	
	num=rasid.nextInt();
	while( num != 0 )
	{
		reversenum= reversenum * 10;
		reversenum= reversenum + num%10;
	num=num/10;
	reversenum++;
	}
	System.out.println("reverse of input number is"+reversenum);	
}
}
