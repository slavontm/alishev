package Serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {


        Person[] people={new Person(1,"Slavon"),
                new Person(2,"NeSlavon"),
                new Person(3,"NEneNeSlavon")};

        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("people.dat"))

        {
 //           FileOutputStream fos=new FileOutputStream(("people.dat"));
 //           ObjectOutputStream oos=new ObjectOutputStream(fos);
     /*       oos.writeInt(people.length);
            for (Person person : people){
                oos.writeObject(person);
            }*/
            oos.writeObject(people);




   //         oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
