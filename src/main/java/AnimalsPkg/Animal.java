package AnimalsPkg;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private LocalDate birthday;
    private ArrayList<String> commands;
    private AnimalType type;

    public Animal(String name, LocalDate birthday, AnimalType type) {
        this.name = name;
        this.birthday = birthday;
        this.type = type;
        commands = new ArrayList<>();
    }

    public void learnCommand(String command) {
        commands.add(command);
    }

    public String getAllCommands() {
        return commands.toString();
    }

    public String getName() {
        return name;
    }
}
