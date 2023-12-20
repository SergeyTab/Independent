import java.util.Scanner;

public class Task3 {

    //Дано двузначное число. Определить:
    // остаток от деления десятков на единицы,
    // результат деления единиц на десятки

    public static void main(String[] args) {


        double rem, res, number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите двузначное число:");
        number = sc.nextDouble();
        sc.close();


            rem = (number / 10) % (number % 10);
            System.out.println("Остаток от деления десятков на единицы: " + rem);

            res = (number % 10) / (number / 10);
            System.out.println("Результат деления единиц на десятки: " + res);
        }



    }
