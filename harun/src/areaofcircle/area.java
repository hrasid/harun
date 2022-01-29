package areaofcircle;

import java.util.Scanner;

public class area {
public static void main(String[] args) {
	Scanner rasid= new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF RADIUS");
	double radius= rasid.nextDouble();
	double area= Math.PI*(radius*radius);
	System.out.println("THE AREA OF CIRCLE IS"+area);
	double circumference=Math.PI*2*radius;
	System.out.println("THE CIRCUMFERENCE OF CIRCLE IS"+circumference);
		rasid.close();
}
}
