package java_ex100;
import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
			
		if(num<0) {
			System.out.println("minus");
			num = num *-1;
			if(num%2==0) {
				System.out.println("even");
			}
				else {
					System.out.println("odd");
					
				}

		}
		else
		{
			System.out.println("plus");		
			if(num%2==0) {
				System.out.println("even");
			}
				else {
					System.out.println("odd");
					
				}

		}
		
		sc.close();
		
	}

}
