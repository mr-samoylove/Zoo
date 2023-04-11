package src;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
    private String name;
    private Date birthday;
    private ArrayList<String> commands;
    private AnimalType type;

    public Animal(String name, Date birthday, AnimalType type) {
        this.name = name;
        this.birthday = birthday;
        this.type = type;
        commands = new ArrayList<>();
    }

    public void teachCommand(String command) {
        commands.add(command);
    }

    public String showAllCommands() {
        return commands.toString();
    }


}
