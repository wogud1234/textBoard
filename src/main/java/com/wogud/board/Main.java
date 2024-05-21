package com.wogud.board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("== 텍스트 게시판 v 0.1==");
        System.out.println("프로그램 시작");

        int lastArticleId = 0;

        while(true) {
            System.out.print("명령어 입력> ");
            String cmd = scan.nextLine();

            if(cmd.equals("/user/article/write")) {
                System.out.println("== 계시물 작성 ==");
                System.out.print("제목> ");
                String title = scan.nextLine();
                System.out.print("내용> ");
                String body = scan.nextLine();


                System.out.println(++lastArticleId + "번 게시물이 생성되었습니다.");
            } else if(cmd.equals("exit")) {
                System.out.println("== 게시판을 종료합니다. ==");
                break;
            }
        }

        scan.close();
        System.out.println("프로그램 종료");
    }
}