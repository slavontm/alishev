package Wildcards;

public class Animal {
    private int id;
//
    public Animal()
    {

    }
    //Constructor
    public Animal(int id) {
    this.id=id;
    }

    //Override toString method





    public String toString(){
    return String.valueOf(id);
    }
    public void  eat(){
        System.out.println("Animal is eating");
    }


}
