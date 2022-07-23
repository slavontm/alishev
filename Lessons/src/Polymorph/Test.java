package Polymorph;

public class Test {
    public static void main(String[] args) {
    Animal an1=new Animal();
    Dog dog1=new Dog();
    Cat cat1=new Cat();

    test(an1);
    test(dog1);
    test(cat1);



        //   Animal animal=new Dog();
//   animal.eat();
//   Dog dog=new Dog();
//   dog.eat();
//   dog.gav(); // <potomushto dog!


                //    Animal animal1=new Animal();
//    Dog dog1=new Dog();
//    animal1.eat();
//    dog1.eat();
    }
   public static void test(Animal animal){
        animal.eat();
   }

}
