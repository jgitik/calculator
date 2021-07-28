package main;


import java.util.Scanner;

public final class  ReadData {
    public static String one;
    public static String two;
    public static int number1;
    public static int number2;
    public static String action;
    public static  String[] numbers=new String[0];


       public static String Read(){


        System.out.println("Введите строку");
        Scanner s= new Scanner(System.in);

       String data= s.nextLine();
       return data;
       }

       public static void Data (String data)
           {


                   if (data.contains("+")) {
                       action = "plus";
                       numbers = data.split("\\+");
                   }
                   if (data.contains("-")) {
                       action = "minus";
                       numbers = data.split("-");
                   }
                   if (data.contains("/")) {
                       action = "delete";
                       numbers = data.split("/");
                   }
                   if (data.contains("*")) {
                       action = "multi";
                       numbers = data.split("\\*");
                   }
                   if (!(numbers.length == 2)) {
                       throw new RuntimeException("Калькулятор умеет работать только с двумя числами");

                   }





               one = numbers[0];
               two = numbers[1];
           }




        }
