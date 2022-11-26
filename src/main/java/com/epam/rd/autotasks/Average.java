package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        Scanner sc = new Scanner(System.in);
        int sum = 0; // Sum of all elements except for 0
        int cnt = 0; // Counts the number of elements except for 0
        int average;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            sum += num;
            cnt++;
        }
        average = sum / cnt;
        System.out.println(average);
    }
}