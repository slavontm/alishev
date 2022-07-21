import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Vvvedi vozr: ");
        int age=scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("Burn");
                break;
            case 7:
                System.out.println("School");
                break;
            case 18:
                System.out.println("Vodka");
                break;
            default:
            System.out.println("Nichego!");

        }


    }


}
