package java_stdin_and_stdout_1;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            int a = scan.nextInt();
            System.out.println(a);
        }
    }
}