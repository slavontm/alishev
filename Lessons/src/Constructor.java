public class Constructor {
    public static void main(String[] args) {
    Human Human1=new Human();
    Human1.setAge(42);
    Human1.setName("Slavon");
        System.out.println(Human1.getAge()+" "+Human1.getName());
    }
}


class Human{
private  String name;
private int age;
    public Human() {

    }
    public Human(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

