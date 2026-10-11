import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("witaj w javie!");
        System.out.print("test 1!");
        System.out.println("test 2!");
        System.out.print("test 3!\n");

        int liczba = 10;
        System.out.println("liczba calkowita:" + liczba);
        double liczbaDouble = 3.5;
        System.out.println("liczba rzeczywista:" + liczbaDouble);
        float liczbaFloat = 3.5f;
        System.out.println("liczba rzeczywista:" + liczbaFloat);
        String tekst = "tekst";
        System.out.println("tekst:" + tekst);
        boolean czyPrawda = true;
        System.out.println("czy prawda:" + czyPrawda);
        char znak = 'a';
        System.out.println("znak:" + znak);

        //Operatory matematyczne
        double a = 11.0;
        double b = 3.0;

        System.out.println("\ndodawanie: " + (a + b));
        System.out.println("odejmowanie: " + (a - b));
        System.out.println("mnozenie: " + (a * b));
        System.out.println("dzielenie: " + (a / b));
        System.out.println("reszta z dzielenia: " + (a % b));

        System.out.println("\n5 / 2: " + (5 / 2));
        System.out.println("5 / 2 (zmiennoprzecinkowo): \n" + (5.0 / 2.0));

        //pobieranie danych
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj swoje imie: ");
        // String imie = scanner.nextLine();
        // System.out.println("Podane imię: " + imie);

        //System.out.println("Podaj liczbe: ");
        //double liczba = scanner.nextDouble();
        //System.out.println("Podana liczba: " + liczba);


        if (a ==10.00) {
            System.out.println("a nie jest rowne 11");
        }else if(a == 11.0){
            System.out.println("a jest rowne 11");
        }else{
            System.out.println("a nie jest rowne 10 ani 11\n");
        }

        //instrukcja switch
        System.out.println("wybierz operacje (+,-,*)");
        String operacja = "+";//scanner.nextLine();

        switch(operacja){
            case "+":
                System.out.println("wybrany operator: " + operacja);
                break;

            case "-":
                System.out.println("wybrany operator: " + operacja);
                break;

            case "*":
                System.out.println("wybrany operator: " + operacja);
                break;

            default:
                System.out.println("nieznany operator");
                break;
        }
        //Pętle
        for(int i = 0; i <= 10; i++){
            System.out.println("iteracja: " + i);
        }
        int j=1;
        while(j <= 5){
            System.out.println("j = " + j);
            j++;
        }

        int wybor;
        do {
            System.out.println("1 - kontynuacja");
            System.out.println("0 - koniec");
            wybor = scanner.nextInt();
        } while (wybor != 0);
    }
}
