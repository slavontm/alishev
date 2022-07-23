package Lesson32;

public class Lesson32 {
    public static void main(String[] args) {
/*        Dog dog=new Dog();
        //Upcasting - Voshodyashee preobrazovanie
        Animal animal=dog;

        //DownCasting
        Dog dog2 =(Dog)animal;
*/
        Animal a=new Animal();
        Dog dog=(Dog)a;
        dog.gav(); ///- err))

    }
}
