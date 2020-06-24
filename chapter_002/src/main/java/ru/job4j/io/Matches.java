package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sp = 11;
        boolean run = true;
        while(run) {
            if (sp > 0) {
                System.out.println("На столе " + sp + " спичек. Вытяните спички");
            }else {System.out.println("Вы выиграли");
                run = false;
            break;}
            int select = Integer.valueOf(input.nextLine());

            if(select== 1|| select==2||select==3&&select<sp){
                sp = sp - select;
            } else{
                System.out.println("Невозможно сделать такой ход");
            }
        }

    }
}
