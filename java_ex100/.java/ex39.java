package java_ex100;
import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

        int small = sc.nextInt();
        
        for (int i = 0 ; i < 2 ; i ++)
		{
            int input = sc.nextInt();
            
            if (small>input)
            	small = input;
		}
        
		   
		

		System.out.printf("%d",small);
		   
		   
		   sc.close();
		}
        
}
