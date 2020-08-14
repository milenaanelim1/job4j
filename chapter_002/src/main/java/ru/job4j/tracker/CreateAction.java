package ru.job4j.tracker;

public class CreateAction implements UserAction{
    private final Output out;

    public CreateAction(Output out){
        this.out = out;
    }

    @Override
    public String name() {
        return "Create a New Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        item.setName(name);
        tracker.add(item);
        return true;
    }
}
