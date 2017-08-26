package app;


import app.tools.AnimalFactory;
import com.zoo.animals.Animal;
import com.zoo.animals.rare.SiberianTiger;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Tiger myTiger = new Tiger();
        // Integer hungerLevel=  myTiger.getHungerLevel();
        // System.out.println(hungerLevel);


        Animal myTiger = new SiberianTiger("Bubu", 78);
        //System.out.println("name: " + myTiger.getName() + " hunger: " + myTiger.getHungerLevel());

        System.out.println(myTiger.toString());
        //myTiger.move();
        // myTiger.makeSound();
        // myTiger.feed();
        //((Tiger)myTiger).move();

        List<Animal> animalList = AnimalFactory.getAnimals();

        for (Animal animal : animalList) {
            System.out.println(animal.getName().toString());
            animal.makeSound();
            System.out.println("-------------------");
        }

    }
}
