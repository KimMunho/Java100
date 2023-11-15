package java_ex100;
import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
			
		switch(str) {
		
		case "D" :
			System.out.print("slowly~");
			break;
		case "C" :
			System.out.print("run!");
			break;
		case "B" :
			System.out.print("good!!");
			break;
		case "A" :
			System.out.print("best!!!");
			break;
		default :
			System.out.print("what?");
			break;
		
		}
		
	}

}
