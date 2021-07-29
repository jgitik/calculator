package main;

public final class Count {
    private static double result;

    public static double getResult() {
        return result;
    }

    public static double calc(int a, int b, String action) throws ThreeNumberException {


            if (a < 0 || a > 10 || b < 0 || b > 10)
                throw new ThreeNumberException("Число не подходит по формату");





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

