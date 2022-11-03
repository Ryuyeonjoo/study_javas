// 문제파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// (0 < A, B < 10)

// 유추파악
// A와 B를 Scanner를 사용하여 입력하여 A + B 값을 출력

// 주요 단어 영문이름 선정
// input_A : 입력 A
// input_B : 입력 B
// T : 테스트 케이스의 개수

// 테스트케이스
// 예제 입력 1 
// 5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2
//  예제 출력 1 
//  2
//  5
//  7
// 17
//  7

// 프로그래밍 순서
// 입력 - 처리 - 출력




import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, input_A, input_B;
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			input_A = sc.nextInt();
			input_B = sc.nextInt();
			System.out.println(input_A + input_B);
		}
	}
}