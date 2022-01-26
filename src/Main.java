import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;
        boolean c = true;

        int y = 12;
        int x = 30;
        int z = 40;

        System.out.println(y > x);
        System.out.println(++y);
        System.out.print("(x == y ): " + (x == z));


        System.out.println("Operatory arytmetryczne: " + "\na = true\tb = false\tc = true");

        System.out.println("(a && b): "+ (a&&b));
        System.out.println("(a && c): " +(a&&c));

        System.out.println("(a || b) : " + (a||b));
        System.out.println("(a || c) : " + (a||b));
        System.out.println("(false || a): "+(false || a));
        System.out.println("!(a && b): " + !(a && b));

        System.out.println();

        System.out.printf("Operatory porównania:" +
                "\nx = %d\ty = %d\tz = %d\n", x, y, z);

        System.out.println("(x == y) : " + (x == y));
        System.out.println("(x == z) : " + (x == z ));


        System.out.println("(x != y) : " + (x != y ));
        System.out.println("(x != z) : " + ( x != z));

        System.out.println("(x > y)  : " + ( x > y));
        System.out.println("(x < y ) : "+ ( x < y ));
        System.out.println("(x >= x) " + (x >= y ));

        System.out.println("((x>y) || (a && b)) : " + ((x > y) || a && c));

    }
}

