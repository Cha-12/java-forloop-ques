package forloop;
import java.util.Scanner;
public class Que7 {    

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int rows = 2*n-1;
		int i,j;
			for(i=1;i<=rows;i++) { 
				if(i<=n) {
					for(j=1;j<=i;j++) {
				System.out.print("*");
			
					}
				}
				else {
					for(j=1;j<=rows-i+1;j++) {
						System.out.print("*");
					}
				}
					System.out.println();
			}
		}
		

	}


