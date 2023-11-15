package java_ex100;
import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();

        if((input >=30 && input <=40)||(input >=60 && input <=70))
    		System.out.print("win");
        else
        	System.out.print("lose");
		
		   
		   
		   sc.close();
		}
        
}
