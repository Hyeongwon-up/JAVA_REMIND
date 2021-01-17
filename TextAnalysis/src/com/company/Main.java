package com.company;

import java.io.*;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner In = new Scanner(System.in);

        System.out.println("파일명을 입력해주세요. ");
        String input = In.nextLine();
        //파일 읽어오기
        FileReader FR = new FileReader(input);

        //분석한 파일 출력하기

        System.out.println("결과 파일명을 입력해주세요. ");

        String ouput = In.nextLine();

        FileWriter FW = new FileWriter(ouput);

        BufferedWriter BW = new BufferedWriter(FW);

        System.out.println("파일 입력 성공");

        while(true) {
            System.out.println("옵션 선택");
            System.out.println("1 - 단어 분석하기 ");
            System.out.println("2 - 특정 단어 검색");
            System.out.println("0 - 종료하기");

            System.out.println("원하는 선택 입력해줘 : ");

            String select = In.next();

            if(select.equals("1")) {
                FR = new FileReader(input);

            }

            if(select.equals("2")) {
                FR = new FileReader(input);
                System.out.println("찾고 싶은 단어를 입력해주세요.");
                In = new Scanner(System.in);

                String Searching = In.nextLine();

                Searching(FR,BW,Searching);
            }


    }
}

public  static void Statistics(FileReader FR, BufferedWriter BW) throws IOException {
        BufferedReader BR = new BufferedReader(FR);

        int TOTAL_WORDS = 0 ;
        int TOTAL_CHARACTERS = 0;
        int TOTAL_PUNCTUATIONS = 0;
        int SHORTEST = 10000;
        int LONGEST = 0;

        String Line;
        StringTokenizer Token;

        while((Line = BR.readLine()) != null) {
            Token = new StringTokenizer(Line, " ");
            while(Token.hasMoreTokens()) {
                TOTAL_WORDS++;
                String Word;
                Word = Token.nextToken();
                TOTAL_CHARACTERS += Word.length();

                if(SHORTEST > Word.length()) SHORTEST = Word.length();

                if(LONGEST < Word.length()) LONGEST = Word.length();

            }
        }


}

public static void Searching(FileReader FR, BufferedWriter BW, String Search) throws IOException {

    BufferedReader BR = new BufferedReader(FR);
    int Appear = 0;
    String Line;
    StringTokenizer Token;
    BW.write("찾고싶은 파일");
    BW.newLine();
    System.out.println("찾고싶은 파일");

    while ((Line = BR.readLine()) != null) {
        Token = new StringTokenizer(Line, " ");
        while (Token.hasMoreTokens()) {
            String word = Token.nextToken();

            if (Search.equals(word)) {
                Appear++;
            }
        }
    }

    System.out.println("이 단어가 나타난 횟수 : " + Appear);
    BW.write("이 단어가 나타난 횟수 : " + Appear);
    BW.newLine();
}


}
