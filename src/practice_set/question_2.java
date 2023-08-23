//Write a java code to find the Simple Interest taking input as principal , rate and time from 
//users . 
//Find amount also and display in separate lines . 

package practice_set;
import java.util.*;

public class question_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal value");
		float p=sc.nextFloat();
		System.out.println("Enter the rate value");
		float r=sc.nextFloat();
		System.out.println("Enter the time period");
		float t=sc.nextFloat();
		System.out.println("The SI is :"+(p*r*t)/100);
		
		System.out.println("Amount will be:"+((p)+(p*r*t)/100));
	}
}
