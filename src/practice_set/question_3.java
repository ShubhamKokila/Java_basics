//Write a java code to find the area and semi-perimeter of triangle taking length of all the 
//three sides of a triangle as input from user . 
package practice_set;
import java.util.*;

public class question_3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side");
		float a=sc.nextFloat();
		System.out.println("Enter the second side");
		float b=sc.nextFloat();
		System.out.println("Enter the third side");
		float c=sc.nextFloat();
		float s=(a+b+c)/2;
		System.out.println("Semr-perimeter is :"+s);
		System.out.println("Area is :"+Math.sqrt((s)*(s-a)*(s-b)*(s-c)));
	}
}
