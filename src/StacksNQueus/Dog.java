package StacksNQueus;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class Dog extends Animal{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name);
        System.out.println("bow bow");
    }
}
