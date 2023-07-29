package OOP;

public class StaticMethod {
    String name;
    int roll;
   static String uni = "QAU";
   //static method to change the value of static variable
   static void change(){
    uni = "MUET"; 
     
}
StaticMethod(int r, String n){
        roll = r;
        name = n;
} 
void display(){
System.out.println("The roll no: "+ roll +" and name is "+ name +" and University is "+ uni);
}
   public static void main(String[] args) {
    StaticMethod.change();
StaticMethod s1 = new StaticMethod(12,"Mohsin" );
StaticMethod s2 = new StaticMethod(13,"Mohsin illahi" );
StaticMethod s3 = new StaticMethod(14,"Mohsin Bhutto" );
s1.display();
s2.display();
s3.display();
   }
}
