package swaptwonumbers;

public class swap {
  public static void main(String[] args) {
	float first=2.50f, second= 4.50f;
	System.out.println("values before swap");
	System.out.println("value of first is "+first);
	System.out.println("value of second is "+second);
	float temprory=first;
	first=second;
	second=temprory;
	System.out.println("after swap");
	System.out.println("value of first is"+first);
	System.out.println("value of second is "+second);
	
}
}
