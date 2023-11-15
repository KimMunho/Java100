package java_ex100;
import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        int num = sc.nextInt();
		int sum = 0;
		   
		   for (int i = 2; i < num;) {
			  
			   sum = sum + i;
			  i = i +2;
	        }

		   System.out.println(sum);
		   
		   sc.close();
		}
        
}
