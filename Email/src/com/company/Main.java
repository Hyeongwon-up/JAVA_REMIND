package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        // write your code here

        Scanner input = new Scanner(System.in);

        String Email;

        String[] information = new String[3];

        System.out.println("Email 을 입력해줘");

        Email = input.next();

        StringTokenizer st1 = new StringTokenizer(Email, "@");

        information[0] = st1.nextToken();

        System.out.println(information[0]);

        StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ".");
        information[1] = st2.nextToken();
        information[2] = st2.nextToken();


        System.out.println(information[1]);
        System.out.println(information[2]);
    }
}
