package Loops;
public class patternProblem1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i <n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println("Increasing Triangle of stars:");
        //Increasing Triangle of stars
        for (int i=1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println("Decreasing Triangle of stars:");
        //Decreasing Triangle of stars
        for (int i=1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }System.out.println();
        }
        
    }
}
