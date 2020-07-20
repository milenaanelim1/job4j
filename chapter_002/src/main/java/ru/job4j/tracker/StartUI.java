package ru.job4j.tracker;


public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        item.setName(name);
        tracker.add(item);
    }

    public static void findAll(Input input, Tracker tracker) {
        Item[] tr = tracker.findAll();
        for (Item item : tr) {
            System.out.println(item.getName());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setName(name);
        item.setId(id);
        boolean tr = tracker.replace(id, item);
        if (tr) {
            System.out.println("=== Item was replaced ===");
        } else {
            System.out.println("=== Item was not found ===");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        boolean tr = tracker.delete(id);
        if (tr) {
            System.out.println("=== Item was successfully deleted ===");
        } else {
            System.out.println("=== Item was not found ===");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        int id = input.askInt("Enter id:");
        Item tr = tracker.findById(id);
        if (tr != null) {
            System.out.println(tr.getName());
        } else {
            System.out.println("=== Item was not found ===");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] trn = tracker.findByName(name);
        for (Item req : trn) {
            System.out.println(req.getName());
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAll(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Replace item");
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