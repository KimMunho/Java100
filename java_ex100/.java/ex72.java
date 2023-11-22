package java_ex100;
import java.util.Scanner;

public class ex72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력된 정수의 합 계산
        
        int num = scanner.nextInt();
        int integer = 0;
        int max = 0;
        
        for (int i = 0; i < num; i++) {
        	
        	integer = scanner.nextInt();
        	
        	if (max < integer)
        	{
        		max = integer;
        	}
        	
        }
        

        // 결과 출력
        System.out.println(max);

        // Scanner 닫기
        scanner.close();


    }
}