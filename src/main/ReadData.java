package main;


import java.util.Scanner;

public class  ReadData {
     private static String one;
    private static String two;


    public static String getOne() {
        return one;
    }

    public static String getTwo() {
        return two;
    }


    private static String action;

    public static String getAction() {
        return action;
    }

    private static  String[] numbers=new String[0];


       public static String read(){


        System.out.println("Введите строку");
        Scanner s= new Scanner(System.in);

       String data= s.nextLine();
       return data;
       }

       public static void data (String data) throws ThreeNumberException {


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
                       throw new ThreeNumberException("Калькулятор умеет работать только с двумя числами");

                   }





               one = numbers[0];
               two = numbers[1];
           }




        }
