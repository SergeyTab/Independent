import java.util.Scanner;

public class Task4 {

    //Даны три вещественных числа a,b,c. Проверить:
    // 1.выполняется ли неравенство a<b<c;
    // 2.выполняется ли неравенство b>a>c.

    public static void main(String[] args) {

        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите вещественное число a = ");
        a = sc.nextDouble();


        System.out.print("Введите вещественное число b = ");
        b = sc.nextDouble();

        System.out.print("Введите вещественное число c = ");
        c = sc.nextDouble();
        sc.close();


        if ((a<b) && (b<c))
        {
            System.out.print("Неравенство a<b<c выполняется");
        }
        else if((b>a) && (a>c))
        {
            System.out.print("Неравенство b>a>c выполняется");
        }
        else
        {
            System.out.print("Нет выполнимых неравенств");
        }
    }

    }
