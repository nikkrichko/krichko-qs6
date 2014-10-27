package lessons.lesson_01;

public class Main {

    public static void main(String[] args) {
        String REVERSE_STRING = "12345";

        ReversString reversString = new ReversString(REVERSE_STRING);

        System.out.println(reversString.getReverseString());
    }
}
