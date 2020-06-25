package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sp = 11;
        boolean run = true;
        int player = 2;
        while (run) {
            if (sp > 0) {
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                System.out.println("На столе " + sp + " спичек. Игрок №" + player + " вытягивает спички");
            } else {
                System.out.println("Игрок №" + player + " -победитель");
                run = false;
                break;
            }
            int select = Integer.valueOf(input.nextLine());

            if (select > 0 && select < 4 && select <= sp) {
                sp = sp - select;
            } else {
                System.out.println("Невозможно сделать такой ход");
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            }
        }

    }
}
