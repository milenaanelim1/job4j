package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "Find Item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] trn = tracker.findByName(name);
        for (Item req : trn) {
            System.out.println(req.getName());
        }
        return true;
    }
}
