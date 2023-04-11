package src;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        if (animals.contains(animal)) {
            animals.remove(animal);
            System.out.println("Animal removed");
        } else
            System.out.println("No such animal in the zoo");
    }
}
