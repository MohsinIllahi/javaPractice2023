package OOP;

 class EncapsulationDemo {
    private String name = "Shirt";
    private int price=1000;
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }

}
public class encapsulation {
public static void main(String[] args) {
    EncapsulationDemo obj = new EncapsulationDemo();
    System.out.println("Your Item is "+ obj.getName() + " & price is "+ obj.getPrice());
}
    
}
