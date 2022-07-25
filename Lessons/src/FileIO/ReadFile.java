package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        String s=File.separator;
        String path;
        path="C:" +s+"Users"+s+"SLAVON"+s+"IdeaProjects"+s+"alishev"+s+"Lessons"+s+"src"+s+"FileIO"+s+"testfile";
 //       System.out.println(path);
        File file=new File(path);
        Scanner scanner=new Scanner(file);
 /*       while(scanner.hasNextLine()) {

            String input = scanner.nextLine();
            System.out.println(input);

        }*/

        String input = scanner.nextLine();
        String [] words =input.split(" ");
        System.out.println(Arrays.toString(words));

        scanner.close(); //CLOSE!
    }
}
