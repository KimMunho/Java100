package java_ex100;
import java.util.Scanner;

public class ex84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 정수 n 입력받기
        System.out.print("삼각형의 높이(n)를 입력하세요: ");
        int n = scanner.nextInt();

        // 역삼각형 출력
        printReverseTriangle(n);
        scanner.close();

    }

    // 역삼각형 출력 함수
    public static void printReverseTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            // 별표 출력

            // 공백 출력
        	 for (int j = 1; j <= i; j++) {
                 
                 System.out.print("*");
             
         }

            System.out.println();
        }
    }
}