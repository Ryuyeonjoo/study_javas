package Step1;
// baekjoon2588_analysis
import java.util.Scanner;
// // 문제 파악
//             4 7 2 ---------(1)
// X           3 8 5 ---------(2)
// ------------------
//           2 3 6 0 ---------(3)
//         3 7 7 6   ---------(4)
//       1 4 1 6     ---------(5)
// -----------------
//       1 8 1 7 2 0 ---------(6)
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
// (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
public class Test2588 {
// 테스트 케이스
// 472
// 385

// 2360
// 3776
// 1416
// 181720
    public static void main(String[] args) {
       //반복값 입력
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        //결과값 구함
        int result3 = number1 * (number2 % 10);
        int result4 = number1 * (number2 / 10%10);
        int result5 = number1 * (number2 / 100);
        int result6 = result3 + result4 * 10 + result5 * 100;

       //결과값 출력
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
