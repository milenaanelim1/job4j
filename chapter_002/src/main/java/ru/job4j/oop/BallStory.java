package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.meetHare(hare);
        hare.tryEat(ball);
        ball.meetWolf(wolf);
        wolf.tryEat(ball);
        ball.meetFox(fox);
        fox.tryEat(ball);
        fox.Eat(ball);
    }
}
