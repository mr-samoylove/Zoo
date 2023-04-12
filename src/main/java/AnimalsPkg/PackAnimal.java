package AnimalsPkg;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal{
    public PackAnimal(String name, LocalDate birthday) {
        super(name, birthday, AnimalType.PACK_ANIMAL);
    }
}
