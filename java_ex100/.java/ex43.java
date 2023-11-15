package java_ex100;
import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = "";

        if (num == 0) 
        {
            result = "영";
        } else 
        {
            String[] unit = {"", "십", "백", "천", "만"};
            String[] numbers = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
            int unitIndex = 0;

            while (num > 0) 
            {
                int digit = num % 10;
                if (digit != 0) {
                    result = numbers[digit] + unit[unitIndex] + result;
                } else 
                {
                    if (unitIndex == 4 && result.length() > 0 && result.charAt(0) == '일') 
                    {
                        result = result.substring(1);
                    }
                }
                num /= 10;
                unitIndex++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
