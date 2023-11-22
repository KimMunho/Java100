package java_ex100;
import java.util.Scanner;

public class ex71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력된 정수의 합 계산
        int sum = 0;
        int num = scanner.nextInt();
        int integer = 0;
        int count = 0;
        
        for (int i = 0; i < 100; i++) {
        	
        	integer = scanner.nextInt();
        	if (integer <2 || integer >10)
        	{
        		System.out.println("n은 2~10입니다.");
        	}
        	else {

            	sum = integer + sum;
            	count ++;
            	if (count == num)
            		i = 100;
        		
        	}
        	
        }
        

        // 결과 출력
        System.out.println(sum);

        // Scanner 닫기
        scanner.close();


    }
}