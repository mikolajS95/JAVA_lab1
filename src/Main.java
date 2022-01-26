import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        System.out.println("Zadanie I:");

        int wiek =26;

        if (wiek%3==0)
        {
            System.out.println("Podzielny przez 3");

        } else
        {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("\nZadanie II:");

        int index =56125;
        System.out.println((index%2==0) ? "Index jest parzysty" : "Index jest NIEparzysty");


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("\nZadanie III:");

        Scanner scan = new Scanner(System.in);

        System.out.println("Ile to jest 5x5?");
        int odp= scan.nextInt();

        if (odp==25)
        {
            System.out.println("Dobra odpowiedź!");
        }
        else{
            System.out.println("Zła odpowiedź.");
        }
        
    }   }
