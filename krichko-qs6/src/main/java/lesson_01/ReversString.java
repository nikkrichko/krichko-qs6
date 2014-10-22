package lesson_01;

/**
 * Created by bionic on 10/15/14.
 */
public class ReversString {
    private String reverseString;

    public ReversString(String reverseString) {
        this.reverseString = reverseString;
        reverse();
    }

    public String getReverseString() {
        return reverseString;
    }

    public void setReverseString(String reverseString) {
        this.reverseString = reverseString;
    }

    private void reverse(){
        String temp = reverseString.substring(0, reverseString.length()-1);
        reverseString = reverseString + (new StringBuilder(temp).reverse().toString() );


    }
}
