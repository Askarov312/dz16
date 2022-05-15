import java.util.Locale;
import java.util.Scanner;
public class Main {
    /** Создайте класс с именем Circle, его свойство PI, область
     и пусть статические методы называются окружностью.
     Чтобы найти площадь: PI * (радиус * радиус)
     Формула PI * 2 * радиус используется для нахождения длины окружности. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();

        Radius radius1 = new Radius(radius);
        System.out.println(radius1);
        System.out.println("Area: " + radius1.getArea());
        System.out.println("Length: " + radius1.getLength());
    }

        }

