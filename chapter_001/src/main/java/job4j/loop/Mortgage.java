package job4j.loop;

public class Mortgage {
public static int year(double amount, double salary, double percent){
    int year;
    percent = percent*0.01;
    for(year=0; amount>0; year++){
        amount=amount+amount*percent-salary;
    }
    return year; }
}
