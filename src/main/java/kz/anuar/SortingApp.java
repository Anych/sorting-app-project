package kz.anuar;

import java.util.Arrays;
public class SortingApp {

    String[] strArray;
    int length;
    int[] intArray;
    StringBuilder output = new StringBuilder();;

    public static void main(String[] args) {
        SortingApp sortingApp = new SortingApp();
        System.out.println(sortingApp.sort(args));
    }
    public String sort(String[] args) {
            strArray = args;
            checkLength();

            intArray = new int[length];
            checkString();
            sorting();

            return output.toString();
    }

    public void checkLength() {
        length = strArray.length;

        if (length > 10 || length == 0) {
            throw new IllegalArgumentException("A length of array must be between 1 to 10.");
        }
    }

    public void checkString() {
        try {
            for (int i = 0; i < length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Arguments must be an integer.");
        }
    }

    public void sorting() {
        Arrays.sort(intArray);

        for (int i = 0; i < length; i++) {
            output.append(intArray[i]);
            if (i < intArray.length - 1) {
                output.append(" ");
            }
        }
    }

}

