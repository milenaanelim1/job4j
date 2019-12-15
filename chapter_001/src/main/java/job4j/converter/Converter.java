package job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRub(int value) {
        return value * 60;
    }

    public static int EuroToRub(int value){
        return value*70;
    }

    public static void main(String[] args) {
      //  int euro = rubleToEuro(140);
       // System.out.println("140 rubles are " + euro + " euro.");

       // int dollar=rubleToDollar(300);
       // System.out.println("300 rubles are " + dollar + "$.");

       // int rubD=dollarToRub(450);
       // System.out.println("450$ are "+rubD+" rub");

       // int rubE=EuroToRub(110);
        //System.out.println("110 euro are "+rubE+" rub");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected==out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        int in2 = 300;
        int expected2 = 5;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2==out2;
        System.out.println("300 RUB are 5 Dollars. Test result:" + passed2);

        int in3 = 450;
        int expected3 = 27000;
        int out3 = dollarToRub(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("450$ = 27000 RUB. Test result: "+passed3);

        int in4 = 110;
        int expected4 = 7700;
        int out4 = EuroToRub(in4);
        boolean passed4 = out4 == expected4;
        System.out.println("110 euro = 7700 RUB. Test result: "+passed4);

    }
}

