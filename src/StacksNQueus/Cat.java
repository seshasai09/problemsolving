package StacksNQueus;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class Cat extends Animal{

    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name);
        System.out.println("meow meow");
    }
}
