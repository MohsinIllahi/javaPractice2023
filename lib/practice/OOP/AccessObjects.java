package OOP;

public class AccessObjects {
    public void method1(){
System.out.println("This is print statemnt of class 1");
    }
    public void method2(int statement){
        System.out.println("This is print statemnt of class "+statement);
    }
    public static void main(String[] args) {
        AccessObjects method1obj= new AccessObjects();
        method1obj.method1();
        method1obj.method2(2);
    }
}
