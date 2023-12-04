import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua agência: ");
        int agency = scanner.nextInt();

        System.out.println("Agência registrada: " + agency);
    }
}
