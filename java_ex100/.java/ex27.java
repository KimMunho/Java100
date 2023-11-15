package java_ex100;
import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = (num1>num2)?num1:num2;
		
			System.out.printf("%d",result);

		sc.close();
		
	}

}
