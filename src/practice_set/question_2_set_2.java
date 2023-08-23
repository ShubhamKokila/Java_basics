// Write a Java program to swap two variables.

package practice_set;
import java.util.*;

public class question_2_set_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first number :");
		float a=sc.nextFloat();
		System.out.println("second number :");
		float b=sc.nextFloat();
		float temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("number is swapped : a="+a+" b="+b);
		
	}

}
