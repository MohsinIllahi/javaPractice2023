package OOP;
class staticVariable {
    static int count = 0;

    staticVariable() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        staticVariable obj1 = new staticVariable();
        staticVariable obj2 = new staticVariable();
        staticVariable obj3 = new staticVariable();

    }
}
