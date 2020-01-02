package job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        int num;
        for (num=2; num<finish; num++){
        if (finish%num == 0 || finish==1){
            break;
        }
        else {
            prime=true;
        }
        }
        return prime;
    }
}
