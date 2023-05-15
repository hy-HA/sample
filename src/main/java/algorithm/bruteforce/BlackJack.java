package algorithm.bruteforce;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드의 개수 입력
        int M = sc.nextInt(); // 목표값 입력
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }

        int biggest = 0;
        for (int a = 0; a < N - 2; a++) {
            for (int b = a+1; b < N - 1; b++) {
                for (int c = b+1; c < N; c++) {
                    int sum = cards[0]+cards[a]+cards[b];
                    if (sum > biggest && sum <= M) {
                        biggest = sum;
                    }
                }
            }
        }
        System.out.println(biggest);
    }
}
