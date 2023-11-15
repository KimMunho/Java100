package java_ex100;
import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
			
		if(num>=90) {
			System.out.println("A");
			}

		else if (num>=70) {
			System.out.println("B");
			}
		else if (num>=40) {
			System.out.println("C");
			}
		else if (num>=0) {
			System.out.println("D");
			}
		sc.close();
		
	}

}
