/*1. Write a java code to find the area of rectangle taking input as length and breadth from user . 
Find its length of diagonal , and perimeter also .
Display length , breadth , diagonal , perimeter and area in separate lines .*/

package practice_set;
import java.util.*;

public class question_1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		float a=sc.nextInt();
		System.out.println("Enter the breadth");
		float b=sc.nextInt();
		System.out.println("THE Area of rectangle is :"+a*b);
		System.out.println("The perimeter of rectangle is :"+(2*(a+b)));
		//we can use pythagoras theorm for finding the length of the diagonal.
		System.out.println("The length of the diagonal is :"+(Math.sqrt(a*a+b*b)));
	}
}
