package Exc1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        File file=new File("filename");
        try {
            Scanner scanner=new Scanner(file);


            /// Zdes kod esli net ERRROR!!
            System.out.println("File naiden");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Yaya");
    }
}
