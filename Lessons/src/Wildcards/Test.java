package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Animal> loA=new ArrayList();
        loA.add(new Animal(1));
        loA.add(new Animal(2));

        List<Dog> loD= new ArrayList();
        loD.add(new Dog());
        loD.add(new Dog());


        test(loA);
        test(loD);


    }
    public static void test(List<?extends Animal> list){
        for (Animal animal: list
             ) {
            System.out.println(animal);
            animal.eat();
        }
            

    }

}
