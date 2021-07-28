package main;

public final class Count {
    public static double result;

    public static double calc(int a, int b, String action) {


            if (a < 0 || a > 10 || b < 0 || b > 10)
                throw new RuntimeException("Число не подходит по формату");





            switch (action) {
                case ("plus"):
                    result = a + b;
                    break;
                case ("minus"):
                    result = a - b;
                    break;
                case ("delete"):
                    result = a / b;
                    break;
                case ("multi"):
                    result = a * b;
                    break;

            }
            return result;

        }
    }

