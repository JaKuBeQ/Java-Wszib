import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char wybor = ' ';

        while (wybor != '0') {

            System.out.println("=== KALKULATOR ===");
            System.out.println("+ - dodawanie");
            System.out.println("- - odejmowanie");
            System.out.println("* - mnozenie");
            System.out.println("/ - dzielenie");
            System.out.println("0 - koniec");

            wybor = scanner.next().charAt(0);

            if (wybor == '0') {
                break;
            }

            System.out.println("Podaj pierwsza liczbe:");
            double a = scanner.nextDouble();

            System.out.println("Podaj druga liczbe:");
            double b = scanner.nextDouble();

            switch (wybor) {
                case '+':
                    System.out.println("Wynik: " + (a + b));
                    break;

                case '-':
                    System.out.println("Wynik: " + (a - b));
                    break;

                case '*':
                    System.out.println("Wynik: " + (a * b));
                    break;

                case '/':
                    if (b == 0) {
                        System.out.println("Nie mozna dzielic przez zero");
                    } else {
                        System.out.println("Wynik: " + (a / b));
                    }
                    break;

                default:
                    System.out.println("Bledny wybor");
            }
        }

        System.out.println("Koniec programu");
    }
}