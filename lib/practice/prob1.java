
import java.util.Scanner;
public class prob1 {
    /*Get Integer from input and print */


	public static void main (String[] args) {
	    int num;
	       
		System.out.println("Enter the Integer!");
		try (Scanner sc = new Scanner(System.in)) {
			num= sc.nextInt();
		}
		System.out.println("There is your number "+num);
	}

}
