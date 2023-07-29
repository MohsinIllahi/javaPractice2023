package NumberMethods;
public class NumberFunctions {
    public static void main(String[] args) {
         Integer x = 15;
        //Returns the byte primitive data type
        System.out.println(x.byteValue());
        //Returns the double primitive data type
        System.out.println(x.doubleValue());
           //Returns the long primitive data type
        System.out.println(x.longValue());
        
        /*
         * CcompareTo() Method
         *  Syntax: public int compareTo(NumberSubClass referenceName)
         *--referencename-->Byte, Integer, Long etc.
         *
         */

       
        System.out.println(x.compareTo(15));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(25));
        
    }
}
