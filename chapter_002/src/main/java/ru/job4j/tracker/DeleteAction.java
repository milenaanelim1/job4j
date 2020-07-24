package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name(){
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker){
        int id = input.askInt("Enter id: ");
        boolean tr = tracker.delete(id);
        if (tr) {
            System.out.println("=== Item was successfully deleted ===");
        } else {
            System.out.println("=== Item was not found ===");
        }
        return true;
    }
}
