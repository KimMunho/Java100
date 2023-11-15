package java_ex100;
import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        int num = sc.nextInt();
			
		   
		   for (int i = 1; i < num+1; i++) {
			   for (int j = 1; j < num+1; j++) {
				   System.out.print("*");
		        }
			   System.out.print("\n");
	        }
		   
		   
		   sc.close();
		}
        
}
