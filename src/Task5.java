public class Task5 {

    public static void count(String str) {
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                letter ++;
            } else if(Character.isSpaceChar(str.charAt(i))) {
                space++;
            } else if(Character.isDigit(str.charAt(i))) {
                number++;
            } else {
                other++;
            }
        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
