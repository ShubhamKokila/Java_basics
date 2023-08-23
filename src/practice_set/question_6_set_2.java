//. Write a Java program to print numbers between 1 to 100 which are divisible 
//by 3, 5 and by both .
package practice_set;
import java.util.*;

public class question_6_set_2 {
	public static void main(String args[]) {
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0 && i%15==0) {
				System.out.println(i);
			}
			
		}
	}

}
