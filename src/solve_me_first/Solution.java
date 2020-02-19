package solve_me_first;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/solve-me-first/
 */

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
