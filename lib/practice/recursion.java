/*Java Recursion concept is a technique of making a function call itself.
This technique provides a way to break complicated problem down into simple problem which are easier to solve. */

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int result= sum(num);
        System.out.println(result);
    }
    public static int sum(int k){
        if (k>0) {
            return k+ sum(k-1);
        } else {
            return 0;
        }
    }
}
