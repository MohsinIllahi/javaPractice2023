package Input;
//Talking Input by using BufferReader Class//
import java.io.*;
public class InputInJava {
    public static void main(String[] args) throws IOException{
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String str = bfn.readLine();
        System.out.println("Enter a Integer");
        int integer = Integer.parseInt(bfn.readLine());

        System.out.println("Your entered String is "+ str);
        System.out.println("Your entered Integer is "+ integer);
    }
}
