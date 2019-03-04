public class Task6 {

    public static void divideBy3() {
        System.out.println("Divided by 3:");
        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void divideBy5() {
        System.out.println("\nDivided by 5:");
        for(int i = 1; i < 100; i++) {
            if(i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void divideBy3And5() {
        System.out.println("\nDivided by 3 & 5:");
        for(int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
