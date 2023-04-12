package UI;

import AnimalsPkg.Animal;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI {
    Scanner scanner;
    AnimalsPkg.Zoo zoo;

    public ConsoleUI(AnimalsPkg.Zoo zoo) {
        scanner = new Scanner(System.in);
        this.zoo = zoo;
    }

    public void showMenu() {
        System.out.println("Enter 1 for screening through all available animals\n" +
                "Enter 2 for setting a new animal\n" +
                "Enter 3 for looking at a certain animal already in stock");
        switch (scanner.next()) {
            case "1":
                System.out.println(zoo.getNames().toString());
                break;
            case "2":
                setNewAnimal();
                break;
            case "3":
                configAnimal();
                break;
            default:
                System.out.println("No such option");
                break;
        }
    }

    private void configAnimal() {
        System.out.println("Enter the name of the animal needed");
        String name = scanner.next();

        Animal animal = null;
        for (Animal a : zoo.getAnimals()) {
            if (a.getName().equals(name)) {
                animal = a;
                break;
            }
        }
        if (animal == null) System.out.println("No such animal");
        else {
            System.out.printf("Enter 1 to screen through all commands known to %s\nOr enter a new command to teach\n", name);
            String option = scanner.next();
            if (option.equals("1")) System.out.println(animal.getAllCommands());
            else {
                animal.learnCommand(option);
                System.out.printf("%s has learned to %s\n\n", animal.getName(), option);
            }
        }
    }

    private void setNewAnimal() {
        System.out.println("Enter the name the new animal");
        String name = scanner.next();

        LocalDate date = null;
        do {
            System.out.println("Enter the year of birth");
            String year = scanner.next();

            System.out.println("Enter the month of birth");
            String month = scanner.next();

            System.out.println("Enter the day of birth");
            String day = scanner.next();

            try {
                date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
            } catch (NumberFormatException | DateTimeException e) {
                System.out.println(e.getMessage());
                System.out.println("/n/nThere's been a mistake in date format, try again\n");
            }
        } while (date == null);

        do {
            System.out.println("Select the type of your animal. Enter the digit corresponding to the type\n" +
                    "1 - dog\n" +
                    "2 - cat\n" +
                    "3 - hamster\n" +
                    "4 - horse\n" +
                    "5 - camel\n" +
                    "6 - donkey");
            String type = scanner.next();
            switch (type) {
                case "1":
                    zoo.addAnimal(new AnimalsPkg.Dog(name, date));
                    break;
                case "2":
                    zoo.addAnimal(new AnimalsPkg.Cat(name, date));
                    break;
                case "3":
                    zoo.addAnimal(new AnimalsPkg.Hamster(name, date));
                    break;
                case "4":
                    zoo.addAnimal(new AnimalsPkg.Horse(name, date));
                    break;
                case "5":
                    zoo.addAnimal(new AnimalsPkg.Camel(name, date));
                    break;
                case "6":
                    zoo.addAnimal(new AnimalsPkg.Donkey(name, date));
                    break;
                default:
                    System.out.println("No such type\n");
                    continue;
            }
            System.out.printf("%s has successfully joined the zoo!\n\n", name);
        } while (false);

    }
}
