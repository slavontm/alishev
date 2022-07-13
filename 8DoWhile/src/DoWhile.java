import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vvedi 5:");
 /*       int val=scanner.nextInt();
        while (val!=5) {
            System.out.println("Eto ne 5!!!");
            val=scanner.nextInt();
        }*/
        int val;
        do {
            System.out.println("Vvedi 5:");
            val=scanner.nextInt();
        } while (val!=5);

        System.out.println("Eto !!!5!!!");
    }
}
