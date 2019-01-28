package beispiele;

import java.util.Scanner;

public class EinzeiligerKommentar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine(); // Kommentar am Ende
        // dies ist eine einzeiliger Kommentar
        System.out.println("Der eingegebene Text lautet: " + text);
    }
}
