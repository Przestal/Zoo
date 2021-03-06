package app.tools;

import com.zoo.animals.Animal;
import com.zoo.animals.Elephant;
import com.zoo.animals.Snake;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.SiberianTiger;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {

    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new SiberianTiger("john", 82));
        animals.add(new Snake("boob", 45));
        animals.add(new Elephant("franio", 8));
        animals.add(new Tiger("tiggo", 12));


        return animals;

    }
}
