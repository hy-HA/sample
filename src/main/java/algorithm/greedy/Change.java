package algorithm.greedy;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt(); // 지불 금액 입력
        int change = 1000 - payment; // 거스름돈 총액 계산

        int[] coins = {500, 100, 50, 10, 5, 1}; // 화폐 단위 배열
        int coinCount = 0; // 거슬러줄 동전 개수
        for(int i : coins) {
            coinCount += change / i;
            change=change%i;

            if(change==0) break;
        }
        System.out.println(coinCount);
    }

}
