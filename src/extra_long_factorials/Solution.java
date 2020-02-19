package extra_long_factorials;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.math.BigInteger;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/extra-long-factorials/
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        boolean oddValue = n % 2 == 1;
        int tmp = n;
        if (oddValue) tmp -= 1;

        int nextSum = tmp;
        int nextMulti = tmp;
        while (nextSum >= 2) {
            result = result.multiply(BigInteger.valueOf(nextMulti));
            nextSum -= 2;
            nextMulti += nextSum;
        }

        if (oddValue)
            result = result.multiply(BigInteger.valueOf(n));

        System.out.println(result);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
