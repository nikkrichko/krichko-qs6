package homeworks.homework_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {

    private String input;
    private int output;

    public Converter(String input) {
        this.input = input;
        System.out.println("You entered wrong format of number: " + input);
        converter(input);
    }

    public Converter() {
        setInputFromConsole();
        converter(input);
    }

    public int getOutput() {
        return output;
    }

    public void printOutput(){
        System.out.println("INT is " + output);
    }

    private void converter(String input){
        try {
            //output = (int)Double.parseDouble(input);
            output = (int)Math.round(Double.parseDouble(input));
        }
        catch (NumberFormatException e) {
            System.out.println("You entered wrong format of number");
            System.exit(0);
        }
    }

    private void setInputFromConsole(){
        System.out.println("Enter something here: ");
        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            input = bufferRead.readLine();
            System.out.println("You have entered: " + input);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

    public char toChar(){
        return (char)input.charAt(0);
    }

    public Double toDouble(){
        return Double.parseDouble(input);
    }

    public float toFloat(){
        return (float)Double.parseDouble(input);
    }

    public byte toByte(){
        return (byte)Double.parseDouble(input);
    }
}
