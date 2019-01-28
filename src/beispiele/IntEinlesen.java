package beispiele;

import java.util.Scanner;

public class IntEinlesen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie eine Zahl ein.");
        int zahl = input.nextInt();
        System.out.println("Sie haben die Zahl " + zahl + "eingegeben.");
    }}
