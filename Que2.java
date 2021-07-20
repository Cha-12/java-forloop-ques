package forloop;
import java.util.Scanner;
public class Que2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n =sc.nextInt();
		int i;
		float sum;
		sum =0;
		for(i=1;i<=n;i++) {
		sum = sum+(float)1/i;}
		System.out.println(sum);
		
	}

}
