package AnimalsPkg;
import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

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

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Animal a: animals)
            names.add(a.getName());
        return names;
    }
}
