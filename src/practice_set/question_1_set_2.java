//1. Write a Java program that takes a number as input and prints its multiplication 
//table using for loop.

package practice_set;
import java.util.*;


public class question_1_set_2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in)
;		System.out.println("Give a number ");
		int a =sc.nextInt();
		System.out.println("Multliplication Table for :"+a);
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+"="+(a*i));
			
		}
	}

}
