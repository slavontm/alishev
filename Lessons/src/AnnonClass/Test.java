package AnnonClass;

interface MayEat{
    public void eat();

}
/*lass Animal implements MayEat{
    public void eat(){
        System.out.println("Animal Eat");
    }

}*/



public class Test {
    public static void main(String[] args) {
        MayEat me = new MayEat() {
            @Override
            public void eat() {
                System.out.println("Eat");
            }
        };
 me.eat();

// Oberride anon class !!
 /*       Animal an2 = new Animal() { //Eto naslednik Animal!!!!
            @Override
            public void eat() {
                System.out.println("Animal2 Eat");
            }
        };
        an2.eat();*/
    }
}
