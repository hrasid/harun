package areaoftriangle;

import java.util.Scanner;

public class area {
public static void main(String[] args) {
  Scanner rasid= new Scanner(System.in);
  System.out.println("ENTER THE WIDTH VALUE");
  double width= rasid.nextDouble();
  System.out.println("ENTER THE HEIGHT VALUE");
  double height=rasid.nextDouble();
  double area= width*height/2;
  System.out.println("THE AREA OF TRIANGLE IS:"+area);
  rasid.close();
}
}
