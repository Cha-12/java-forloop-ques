//find x raise to the power y using loop;
package forloop;
import java.util.Scanner;

public class Que1 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();		
		int result = 1;
		for(y=1;y<=5;y++) {
			result = result*x;}
			System.out.println(result);
		
		
		
	}

}
