package homeworks.homework_01;

public class Main {

    public static void main(String[] args) {
        String str = "1.12345";

        Converter converter = new Converter(str);
        converter.printOutput();
        System.out.println("char = " + converter.toChar());
        System.out.println("double = " + converter.toDouble());
        System.out.println("float = " + converter.toFloat());
        System.out.println("byte = " + converter.toByte());

    }

}