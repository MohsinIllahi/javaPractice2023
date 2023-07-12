package OOP;
//*A constructor in java is a specialmethod that is used to initialize objects . The constructor is called when object of a class is created.It can be used to set initial values for object attributes. */
//Class
public class JavaConstructor {
    //variable for Class
    String animal;
    //* Constructor For JavaConstructor class
    public JavaConstructor(String anim){
        //*Initial value for string animal.*/
        animal=anim;
    }
    public static void main(String[] args) {
        //Constructor can also have parameter to initialize attr
        JavaConstructor obj= new JavaConstructor("Cow");
        System.out.println(obj.animal);
    }
}
