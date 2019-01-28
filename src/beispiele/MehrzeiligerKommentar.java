package beispiele;

import java.util.Scanner;

public class MehrzeiligerKommentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        /*
        dies ist eine mehrzeiliger Kommentar,
        er kann beliebig viele Zeilen lang sein
        */
        System.out.println("Der eingegebene Text lautet: " + text);
    }
}
