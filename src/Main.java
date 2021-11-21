import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
         char variableChar = 'M';
         String variableString = "STRING";
        byte variableByte = -50;
         short variableShort = 32700;
         int variableInt = 20000000;
         long variableLong= 20000000000L;
         var variable = 423432;
         boolean variableBolean= true;
         float variableFloat=3.14F;
         double variableDouble=3.1434;

         System.out.println("\nZadeklarowane zmienne:");
         System.out.println(variableChar);
        System.out.println(variableString);
        System.out.println(variableByte);
        System.out.println(variableShort);
        System.out.println(variableInt);
        System.out.println(variableLong);
        System.out.println(variable);
        System.out.println(variableBolean);
        System.out.println(variableFloat);
        System.out.println(variableDouble);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        int liczbaA = 10;
        int liczbaB= 4;
        double liczbaX= 2.5;
        double liczbaY= 12.25;
        System.out.println("\nZadanie II");
        System.out.println("Wynik dzielenia na liczbach A i B to: " + liczbaA/liczbaB);
        System.out.println("Wynik mnożenia liczb A i B to: " + liczbaA*liczbaB);
        System.out.println("Wynik odejmowania liczb X i Y to: " + (liczbaX-liczbaY));
        System.out.println("Wynik dodawania liczb X i Y to: " + (liczbaX+liczbaY));
        System.out.println("Wynik modulo na liczbach A i B to: " + liczbaA%liczbaB);
    }
}
