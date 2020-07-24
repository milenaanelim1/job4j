package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name(){
        return "Find All Items";
    }

    @Override
    public boolean execute(Input input,Tracker tracker) {
        Item[] tr = tracker.findAll();
        for (Item item : tr) {
            System.out.println(item.getName());
        }
        return true;
    }
}
