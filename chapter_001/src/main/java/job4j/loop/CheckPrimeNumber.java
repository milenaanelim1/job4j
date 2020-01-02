package job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = true;
        int finish;
        for (finish=2; finish<num; finish++){
        if ((num%finish == 0)){
            prime=false;
        }
        }
        return prime;
    }
}
