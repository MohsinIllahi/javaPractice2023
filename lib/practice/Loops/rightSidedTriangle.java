package Loops;

public class rightSidedTriangle {
    public static void main(String[] args) {
        int n= 5;
        System.out.println("Increasing right sided triangle");
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println("Decreasing right sided triangle");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  "); 
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
