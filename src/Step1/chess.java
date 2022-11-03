package Step1;

import java.util.Scanner;

public class chess {
//문제
//흰색 피스는 개수가 올바르지 않았다
//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
//입력
//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();
        int F = in.nextInt();

        int K = 1 - A;
        int Q = 1 - B;
        int L = 2 - C;
        int V = 2 - D;
        int N = 2 - E;
        int P = 8 - F;


//출력
//첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 
//음수라면 제거해야 하는 것이다.
System.out.println(K);
System.out.println(Q);
System.out.println(L);
System.out.println(V);
System.out.println(N);
System.out.println(P);
in.close();
}
}

