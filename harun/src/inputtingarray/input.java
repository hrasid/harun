package inputtingarray;

import java.util.Scanner;

public class input {
public static void main(String[] args) {
	Scanner rasid= new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("Enter the elements");
	for(int i=0;i<10;i++)
	{
		array[i]=rasid.nextInt();
		
	}
	for(int num: array)
	{
		sum=sum+num;
		
	}
	System.out.println("sum of array elements is:"+sum);
}
}
