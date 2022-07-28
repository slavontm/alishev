package Serialization2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream("people.det"))){
          //  FileInputStream fis=new FileInputStream("people.dat");
          //  ObjectInputStream ois=new ObjectInputStream(fis);

 /*           Person person1=(Person) ois.readObject();
            Person person2=(Person) ois.readObject();
/*

/            int personCount=ois.readInt();
            Person[] people=new Person[personCount];
                 for(int i=0;i<personCount;i++){
                people[i]=(Person)ois.readObject();

            } */
            Person[] people=(Person[])ois.readObject();



            ois.close();
            System.out.println(Arrays.toString(people));

        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
