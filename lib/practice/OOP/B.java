package OOP;

class B {

void m() {

System.out.println("AA");
}

public class C extends B {
     void m() {

System.out.println("88");
}}
public static void main(String[] args){

C object = new C();

object.m();
}}
