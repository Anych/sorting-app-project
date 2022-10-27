package kz.anuar;

import java.util.Scanner;

/**
 * Main class of application that takes String of integers
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Please write ten natural numbers and use space between them");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        final SortingApp sortingApp = new SortingApp();
        String output = sortingApp.sort(s);
        System.out.println(output);
    }
}
