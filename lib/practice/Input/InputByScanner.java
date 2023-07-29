package Input;

import java.util.*;


/*
 This is 2nd way to get input from user as we saw earlier by BufferReader 
 so now is time to get the same sort of thing by using Scanner
 . Scanner is advanced version of BufferReader
 .
 */
public class InputByScanner {
    public static void main(String[] args) {
        // // Scanner definition
        Scanner sc = new Scanner(System.in);
        // for taking one word as input
        System.out.println("Enter one word ");
        String word = sc.next();
        /*
         * add an extra call to nextLine() 
         * whenever you are using nextLine() to retrieve strings after prior calls to any of the 
         * other next functions (like nextInt(), nextDouble(), nextChar(), etc.).
         */
        sc.nextLine();
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("enter an Integer ");
        int integer = sc.nextInt();
        System.out
                .println("Your entered word is " + word + " &\n the string is " + str + " & \n Integer is " + integer);
   
    }
}
