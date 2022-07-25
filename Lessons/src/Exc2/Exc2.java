package Exc2;

import java.io.IOException;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) throws ScannerException /*throws IOException */ {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            int x= Integer.parseInt(scanner.nextLine());

            if (x!=0){
 //               try {
                    throw new ScannerException("Nado 0!!!");
 /*               }
                catch (IOException e){
                    System.out.println("Nol vvodi!!!");
                }*/
            }

        }
    }
}
