import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Wprowadź imie: ");
        String imie = scan.nextLine();

        System.out.print("Wprowadź nazwisko: ");
        String nazwisko = scan.nextLine();

        System.out.print("Wprowadź wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Wprowadź nr indeksu: ");
        int nrIndexu = scan.nextInt();

        System.out.printf("\n%s %s ", imie , nazwisko);
        System.out.println("\nWiek: "+ wiek);
        System.out.println("Nr. indeksu: "+ nrIndexu);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        System.out.print("\nPodaj pierwsza liczbe: ");
        double num1 = scan.nextInt();

        System.out.print("\nPodaj druga liczbe: ");
        double num2 = scan.nextInt();

        System.out.println("Wynik dodawania: " + (num1+num2));
        System.out.println("Wynik odejmowania: " + (num1 - num2));
        System.out.println("Wynik mnożenia: " + num1 * num2);
        System.out.println("Wynik dzielenia: " + num1/num2);
        System.out.println("Wynik reszty z dzielenia: " + num1%num2);

    }
}
