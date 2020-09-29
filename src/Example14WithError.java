import java.util.Scanner;
public class Example14WithError {
    public static void main (String[] argv) {

        float a;
        float b;
        float c;
        float fst = 0;
        float snd = 0;
        float trd = 0;

        Scanner inputValue;
        inputValue = new Scanner (System.in);

        System.out.println ("Please, enter the first value:");
        a = inputValue.nextFloat();

        System.out.println ("Now, please enter the second value:");
        b = inputValue.nextFloat();

        System.out.println ("Last, please enter the third value:");
        c = inputValue.nextFloat();

        if (a < b && a < c) {
            fst = a;
        } else {
            if (a > b && a > c) {
                trd = a;
            } else {
                snd = a;
            }
        }

        if (b < a && b < c) {
            fst = b;
        } else {
            if (b > a && b > c) {
                trd = b;
            } else {
                snd = b;
            }
        }

        if (c < a && c < b) {
            fst = c;
        } else {
            if (c > a && c > b) {
                trd = c;
            } else {
                snd = c;
            }
        }
        System.out.println ("These numbers set in ascendent order: " + fst + " , " + snd + " , " + trd);
    }
}