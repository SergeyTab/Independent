import java.util.Scanner;

public class Task2 {

    //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

    public static void main(String[] args) {

        double a, r, s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону квадрата:");
        a = sc.nextDouble();
        System.out.println("Введите радиус круга:");
        r = sc.nextDouble();
        sc.close();

        s1 = a * a;
        s2 = Math.PI * r * r;
        System.out.println("Площадь квадрата: " + s1);
        System.out.println("Площадь круга: " + s2);

        if (s1 > s2) System.out.println("Площадь квадрата больше");
        else if (s2 > s1) System.out.println("Площадь круга больше");
        else System.out.println("Площади равны");
    }
}
