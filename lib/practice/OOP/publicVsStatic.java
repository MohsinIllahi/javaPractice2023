package OOP;

public class publicVsStatic {
    //static method
    static void mystaticMethod(){
        System.out.println("Static methods can be called without creating objects.");
    }
    //public class
    public void mypublicMethod() {
        System.out.println("Public methods can be called by creating objects.");
    }
    public static void main(String[] args) {
        //calling the static method
        mystaticMethod();
        //public class can't be called directly without creating an object
        //mypublicMethod();
    }
}
