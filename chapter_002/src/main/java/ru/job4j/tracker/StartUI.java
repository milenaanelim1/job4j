package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = new Item[100];
                tracker.findAll(items, 100);
            } else if (select == 2) {
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.edit(item);
            } else if (select == 3) {
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.delete(item);
                System.out.println("=== Successfully deleted ====");
            } else if (select == 4) {
                int id = input.askInt("Enter id:");
                tracker.findById(id);
            } else if (select == 5) {
                String name = input.askStr("Enter name: ");
                tracker.findByName(name);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}