package job4j.calculator;

/**
 * Class Calculator для вычисления арифметических операций + - * :
 * @author elena
 * @since 13.01.2020
 */

public class Calcuator {

    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first +"+"+second+"="+result);
    }

    /**
     * Умножение
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first +"*"+second+"="+result);
    }

    /**
     * Деление
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first +"/"+second+"="+result);
    }

    /**
     * Вычитание
     * @param first первый аргумент
     * @param second второй аргумент
     */
    public static void subtrack(int first, int second) {
        int result = first - second;
        System.out.println(first +"-"+second+"="+result);
    }


    /**
     * Main.
     * @param args -args.
     */
    public static void main(String[] args){
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtrack(10,5);
    }
}

