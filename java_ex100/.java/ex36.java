package java_ex100;
import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
			
		   
		   for (int i = 1; i < num1+1; i++) {
			   for (int j = 1; j < num2+1; j++) {
				   System.out.printf("%d %d\n", i, j);
		        }
	        }
		   
		   
		   sc.close();
		}
        
}
