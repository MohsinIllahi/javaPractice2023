
package Input;
import java.io.*;
import java.io.InputStreamReader;

/**
 * InputInBuffer
 */
public class InputInBuffer {
public static void main(String[] args) {
    //Creating instance of class BufferReader
    BufferedReader bfr = new BufferedReader(
        new InputStreamReader(System.in)
    );
    String name;
    //try catch block is used to handle the exception
    try {
       System.out.println("Enter your name :");
       name = bfr.readLine();
       System.out.println("Your name is "+ name);

    } catch (Exception e) {
       
    }
}
    
}