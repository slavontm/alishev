package Generics;

import Lesson32.Animal;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List an=new ArrayList();
        Animal ourAnimal=new Animal();
        an.add("Cat");
        an.add("Dog");
        an.add("Svin");
        an.add(ourAnimal);


        String animal=(String) an.get(3);
        System.out.println(animal);

      //  String an=(String) animal.get(1);
       // String an=(String) animal.get(1).toString();



        List<String> an2=new ArrayList<String>();

        an2.add("dog2");
        an2.add("cat2");
        an2.add("svin2");
        String an2res=an2.get(1);


        System.out.println(an2res);

    }
}
