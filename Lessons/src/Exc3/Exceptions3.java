package Exc3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {


        //Checked(Compile time)

        File file = new File("test");
        Scanner scanner;

        {
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }


        //Unchecked (Runtime) - Error in program


  ///!!!!!!!      class Runtime Exceptiom - all other Excepton classes in JAVA - Checked!

  //      int a=6/0; //Div by     zero


  //      String name=null;
  //      System.out.println(name.length()); NULL Exception!

  //      int [] arr=new int[2];
  //      System.out.println(arr[2]); //ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2




    }
}
