
package test;

import java.util.Scanner;

class Odd {
    public static int calculateOddSum(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i += 2) { // 1부터 n까지 홀수만 더합니다.
            oddSum += i;
        }
        return oddSum;
    }
}

class OddEven extends Odd {
    public static int calculateEvenSum(int n) {
        int evenSum = 0;
        for (int i = 2; i <= n; i += 2) { // 1부터 n까지 짝수만 더합니다.
            evenSum += i;
        }
        return evenSum;
    }
}



public class ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = scanner.nextInt();

        int oddSum = Odd.calculateOddSum(n);
        int evenSum = OddEven.calculateEvenSum(n);

        System.out.println("짝수의 합: " + evenSum);
        System.out.println("홀수의 합: " + oddSum);
    }
}




