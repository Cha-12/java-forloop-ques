package forloop;
import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the value of n:");
	int n = sc.nextInt();
	int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i-1;j++) {
			System.out.print("  ");
		}
		for(j=1;j<=n-i+1;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}

}
