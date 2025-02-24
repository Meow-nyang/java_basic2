package basic.constate;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = sc.nextInt();
        System.out.println("score = " + score);

        if (score >= 60) {
            // 조건식이 참일 경우에만 실행.
            System.out.println("시험에 합격하셨습니다!");
        } else {
            // if 조건식의 결과가 거짓인 경우 실행.
            System.out.println("시험에 불합격하셨습니다!");
        }

        System.out.println("시험 치르느라 고생 많으셨습니다!");


        sc.close();
    }

}







