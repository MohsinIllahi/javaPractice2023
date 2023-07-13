package Loops;

public class hillPatternTriangle {
    public static void main(String[] args) {
        int n= 5;
        System.out.println("Hill Pattern triangle");
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Reverse Hill Pattern triangle");
          for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  "); 
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
