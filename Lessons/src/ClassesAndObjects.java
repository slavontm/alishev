public class ClassesAndObjects
{
    public static void main(String[] args) {

        Person slavon=new Person();
                slavon.setName("Slavon");
                slavon.setAge(42);
        Person neslavon=new Person();
                neslavon.setName("Drugoy");
                neslavon.setAge(37);
                slavon.speak();
                System.out.println("Dopensii: "+slavon.calculate65Year());
                neslavon.speak();
                System.out.println("Dopensii: "+neslavon.calculate65Year());
   //     System.out.println(slavon.name+" "+slavon.age);
   //     System.out.println(neslavon.name+" "+neslavon.age);
    }
}
class Person{
    //1. Data
    //2. Methods
private String name;
private  int age;


public void setName(String name)
 {
     this.name=name;
 }
public void setAge(int age)
    {
        this.age=age;
    }
 int calculate65Year(){
     int years=65-age;
    return years;

 }
 void speak() {
     System.out.println("Ya "+name+","+"Mne "+age);
 }
}