package java_if_else;

// ALL THESE IMPORTS ARE NECESSARY FOR TESTS TO PASS,
// EVEN THOUGH INTELLIJ IS RIGHT AND SEES THEM AS UNNECESSARY

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/java-if-else/
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 1)
            System.out.println("Weird");
        else {
            if (N >= 2 && N <= 5 || N > 20)
                System.out.println("Not Weird");
            else
                System.out.println("Weird");
        }

        scanner.close();
    }
}
