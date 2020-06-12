package job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first>second ? first : second;
        return result;
    }
    public static int max(int first, int second, int third){

        return max(max(first, second),third);
    }
    public static int max(int first, int second, int third, int forth){
        return max(max(first, second),max(third,forth));
    }
}