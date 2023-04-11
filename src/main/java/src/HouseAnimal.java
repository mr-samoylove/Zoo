package src;

import java.util.Date;

public abstract class HouseAnimal extends Animal {
    public HouseAnimal(String name, Date birthday) {
        super(name, birthday, AnimalType.HOUSE_ANIMAL);
    }
}
