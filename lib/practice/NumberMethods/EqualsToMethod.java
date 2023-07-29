package NumberMethods;
public class EqualsToMethod {
    public static void main(String[] args) {
        /*The method determines whether the Number object that
         invokes the method is equal to the object that is passed as an argument.
    The method returns True if the argument is not null and is an object of the same 
    type and with the same numeric value.
 */
        Integer x = 5;
        Integer y =10;
        Integer z= 5;
        short a = 5;
System.out.println(x.equals(y));
System.out.println(x.equals(z));
//Compares Not only the value but also data type
System.out.println(x.equals(a));
    }
}
