package floydtriangle;

import java.util.Scanner;

public class floyd {
	public static void main(String[] args) {
		Scanner rasid= new Scanner(System.in);
		int row,counter,number=1,j;
		System.out.println("ENTER THE NUMBER OF ROWS IN TRIANGLE");
		row=rasid.nextInt();
		System.out.println("THE FLOYDS TRIANGLE");
		System.out.println("****************");
		for (counter=1;counter<=row;counter++)
		{
			for (j=1;j<=counter;j++)
			{
				System.out.print(number+"");
				number++;
				
		}
			System.out.println();
			rasid.close();
	}

}
}