//find x raise to the power y using loop;
package forloop;
import java.util.Scanner;

public class Que1 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		int i;
		int result = 1;
		for(i=1;i<=y;i++) {
			result = result*x;}
			System.out.println(result);
		
		
		
	}

}
