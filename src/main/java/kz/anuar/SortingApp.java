package kz.anuar;

import java.util.Arrays;

/**
 * Sorting class which sorts a string of integers in ascending order
 */
public class SortingApp {

    String[] str;
    int length;
    int[] intArray;
    StringBuilder output = new StringBuilder();;

    public String sort(String args) {
            str = args.split(" ");
            checkLength();

            intArray = new int[length];
            checkString();
            sorting();

            return output.toString();
    }

    public void checkLength() {
        length = str.length;

        if (length > 10 || length == 0) {
            throw new IllegalArgumentException("A length of array must be between 1 to 10.");
        }
    }

    public void checkString() {
        try {
            for (int i = 0; i < length; i++) {
                intArray[i] = Integer.parseInt(str[i]);
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