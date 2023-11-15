package java_ex100;
import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[100];
		
		int count = 0;
		
		
		   while (true) {
	            int input = sc.nextInt();
	            num[count] = input;
	            count++;

	            if (input == 0) {
	                break;
	            }
	        }
		   for (int i = 0; i < count; i++) {
	            System.out.println(num[i]);
	        }
		   
		   
		   sc.close();
		}
        
}
