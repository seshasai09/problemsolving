package StacksNQueus;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vasumathi on 09/08/2017.
 */
public class AnimalShelter {

    private List<Animal> catQueue;
    private List<Animal> dogQueue;

    public AnimalShelter(){
        catQueue = new LinkedList<Animal>();
        dogQueue = new LinkedList<Animal>();
    }

    public boolean enqueue(Animal animal){
        animal.age = new Date().getTime();
        if(animal instanceof Dog){
            dogQueue.add(animal);
        }else{
            catQueue.add(animal);
        }
        return true;
    }

    public Animal dequeueAny(){
        Animal dog = dogQueue.get(0);
        Animal cat = catQueue.get(0);
        if(cat.age<dog.age) {
            catQueue.remove(cat);
            return cat;
        }

        dogQueue.remove(dog);
        return dog;
    }

    public Animal dequeueDog(){
        Animal dog = dogQueue.get(0);
        dogQueue.remove(0);
        return dog;
    }

    public Animal dequeueCat(){
        Animal cat = catQueue.get(0);
        catQueue.remove(0);
        return cat;
    }
}
