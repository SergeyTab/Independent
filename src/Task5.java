import java.util.Scanner;

public class Task5 {

    //Даны два числа. Если квадратный корень из второго числа меньше первого числа,
    // то увеличить второе число в пять раз.

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a = ");
        a = sc.nextInt();


        System.out.print("Введите число b = ");
        b = sc.nextInt();
        sc.close();

        if (Math.sqrt(b) < a)
        {
            b = b * 5;
            System.out.printf(
                    "Число а: = %d\nЧисло b: = %d",
                    a,
                    b
            );
        }
        else
        {
            System.out.printf(
                    "Число а: = %d\nЧисло b: = %d",
                    a,
                    b
            );
        }

    }
}
