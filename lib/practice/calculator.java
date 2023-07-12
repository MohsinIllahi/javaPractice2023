import java.util.Scanner;
public class calculator {
    //*Add */
     static int add(int num1,int num2){
return num1+num2;
    }
    //*Subtract */
    static int Subtract(int num1,int num2){
        return num1-num2;
            }
    //*Multiply */
    static int Multiply(int num1,int num2){
        return num1*num2;
            }
    //*Divide */
    static void Divide(int num1,int num2){
      if (num1==1&&num2==0) {
        System.out.println("Can't divide by zero.");
      } else {
        System.out.println(num1/num2);
      }
            }
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Input the first number: ");
            int num1 = input.nextInt();
            System.out.print("Input the second number: ");
            int num2 = input.nextInt();
            System.out.print("Enter a operation /,*,+,-: ");  
String operation= input.next();
      
            //String operation="/";
            switch (operation) {
                case "*":
                    System.out.println(Multiply(num1,num2));
                    break;
                case "/":
                    Divide(num1,num2);
                    break;
                case "-":
                    System.out.println(Subtract(num1,num2));
                    break;
                case "+":
                    System.out.println(add(num1,num2));
                    break;
            
                default:
                    System.out.println("Operation is invalid.");
                    break;
            }
        }
        
    }
}
