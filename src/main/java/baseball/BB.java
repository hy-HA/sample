package baseball;

import java.util.ArrayList;
import java.util.List;

public class BB {
    private int[] list = new int[3];

    int cnt;

    public String game(int a, int b, int c){

        if (cnt>=3) {
            return "게임이 종료되었습니다";
        }
        int result = start(a, b, c);

        if(result == 3) return "win";
        else return "loose 다시하시겠습니까";

    }

    private int start(int a, int b, int c) {
        cnt+=1;

        list = new int[] {8,9,5};

        int strikeCnt = 0;
        int ballCnt = 0;
        int outCnt = 0;

        if (a == list[0]) {
            strikeCnt++;
        } else if (a == list[1] || a == list[2]) {
            ballCnt++;
        } else {
            outCnt++;
        }

        if (b == list[1]) {
            strikeCnt++;
        } else if (b == list[0] || b == list[2]) {
            ballCnt++;
        } else {
            outCnt++;
        }

        if (c == list[2]) {
            strikeCnt++;
        } else if (c == list[0] || c == list[1]) {
            ballCnt++;
        } else {
            outCnt++;
        }
        System.out.println(String.format("스트라이크:%s, 볼:%s, 아웃:%s",strikeCnt,ballCnt,outCnt));
        return strikeCnt;
    }
}
