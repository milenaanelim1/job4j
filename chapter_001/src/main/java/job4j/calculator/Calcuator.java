package job4j.calculator;

public class Calcuator {
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first +"+"+second+"="+result);
    }

    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first +"*"+second+"="+result);
    }

    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first +"/"+second+"="+result);
    }

    public static void subtrack(int first, int second) {
        int result = first - second;
        System.out.println(first +"-"+second+"="+result);
    }
    public static void main(String[] args){
        add(1,1);
        div(4,2);
        multiply(2,1);
        subtrack(10,5);
    }
}

