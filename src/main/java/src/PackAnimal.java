package src;

import java.util.Date;

public abstract class PackAnimal extends Animal{
    public PackAnimal(String name, Date birthday) {
        super(name, birthday, AnimalType.PACK_ANIMAL);
    }
}
