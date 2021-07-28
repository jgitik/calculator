package main;



public class Main {
    public static void main(String args[]) {
        String one;
        String two;

        ReadData.Data(ReadData.Read());
        one=ReadData.one;
        two=ReadData.two;


        if(Whatnumber.isArabic(one) && Whatnumber.isArabic(two)) {
            Count.calc(Whatnumber.Arabic(one), Whatnumber.Arabic(two), ReadData.action);
            PrintR.print();
        }
        else

        if(Whatnumber.isRim(one) && Whatnumber.isRim(two)) {
            Count.calc(Whatnumber.Rimlan(one), Whatnumber.Rimlan(two), ReadData.action);
            System.out.println("Ответ:"+ArabicToRim.toRoman(Count.result));

        }
        else
        PrintR.Error();








    }
}





