package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println("Cat's name:" + this.name + ", ate:" + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();
        black.giveNick("Black Cat");
        black.eat("fish");
        black.show();

    }
}


