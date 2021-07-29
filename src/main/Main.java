package main;



public class Main {
    public static void main(String args[]) throws ThreeNumberException {
        String one;
        String two;

        ReadData.data(ReadData.read());
        one=ReadData.getOne();
        two=ReadData.getTwo();


        if(Whatnumber.isArabic(one) && Whatnumber.isArabic(two)) {
            Count.calc(Whatnumber.Arabic(one), Whatnumber.Arabic(two), ReadData.getAction());
            PrintR.print();
        }
        else

        if(Whatnumber.isRim(one) && Whatnumber.isRim(two)) {
            Count.calc(Whatnumber.Rimlan(one), Whatnumber.Rimlan(two), ReadData.getAction());
            System.out.println("Ответ:"+ArabicToRim.toRoman(Count.getResult()));

        }
        else
        PrintR.error();








    }
}





