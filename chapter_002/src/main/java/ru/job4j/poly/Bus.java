package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void ride() {
        System.out.println("Автобус едет");

    }

    @Override
    public void passengers(int number) {
        System.out.println("В салоне"+ number + " пассажиров");

    }

    @Override
    public int price(int fuel){
        return fuel*40;
    }
}
