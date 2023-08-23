// Write a Java program to extract the first half of a string of even length.

package practice_set;
import java.util.*;

public class question_7_set_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the even lenght string");
		String a= sc.next();
		for(int i=0;i<a.length()/2;i++) {
			System.out.print(a.charAt(i));
		}
		
	}

}
