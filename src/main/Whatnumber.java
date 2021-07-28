package main;

import java.util.HashMap;

public class Whatnumber {
    public  static HashMap<String,Integer> rim= new HashMap();
    static{

        rim.put("I",1);
        rim.put("II",2);
        rim.put("III",3);
        rim.put("IV",4);
        rim.put("V",5);
        rim.put("VI",6);
        rim.put("VII",7);
        rim.put("IIX",8);
        rim.put("IX",9);
        rim.put("X",10);
    }

    public static int Rimlan(String a){
         return rim.get(a);



    }

    public static int Arabic(String a){
             return Integer.parseInt(a) ;

    }

    public static boolean isRim(String a)
    {
        return rim.containsKey(a);
    }
     public static boolean isArabic(String a)
     {
         try {
             Integer.parseInt(a);
         } catch(NumberFormatException e) {
             return false;
         } catch(NullPointerException e) {
             return false;
         }

         return true;
     }
}
