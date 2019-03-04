public class Task2 {

    public static int sumOfIntegers(int int1, int int2) {
        return int1 + int2;
    }

    public static int differenceOfIntegers(int int1, int int2) {
        return int1 - int2;
    }

    public static int productOfIntegers(int int1, int int2) {
        return int1 * int2;
    }

    public static double averageOfIntegers(int int1, int int2) {
        return sumOfIntegers(int1, int2) / 2;
    }

    public static int minOfIntegers(int int1, int int2) {
        if(int1 > int2) return int2;
        else return int1;
    }

    public static int maxOfIntegers(int int1, int int2) {
        if(int1 > int2) return int1;
        else return int2;
    }
}
