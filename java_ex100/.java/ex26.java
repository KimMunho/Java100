package java_ex100;
import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean flag = sc.nextBoolean();
		
		
		if(flag == true) {
			System.out.print("false");		
		}
		else {
			System.out.printf("true");
		}
		sc.close();
		
	}

}
