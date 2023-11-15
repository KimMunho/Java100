package java_ex100;
import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();

        if((input >=50 && input <=70) || input%6==0)
    		System.out.print("win");
        else
        	System.out.print("lose");
		
		   
		   
		   sc.close();
		}
        
}
