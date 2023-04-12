package AnimalsPkg;

import java.time.LocalDate;

public abstract class HouseAnimal extends Animal {
    public HouseAnimal(String name, LocalDate birthday) {
        super(name, birthday, AnimalType.HOUSE_ANIMAL);
    }
}
