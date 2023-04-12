import UI.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        AnimalsPkg.Zoo zoo = new AnimalsPkg.Zoo();
        ConsoleUI ui = new ConsoleUI(zoo);

        while (true)
            ui.showMenu();
    }
}