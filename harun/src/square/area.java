package square;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner rasid=new Scanner(System.in);
		System.out.println("Enter the sides of square");
		double side=rasid.nextDouble();
		double area= side*side;
		System.out.println("THE AREA OF SQUARE IS:"+area);
	}

}
