import java.util.Scanner;

public class Task1 {

    //В чемпионате по футболу команде за выигрыш дается 3 очка,
    // за проигрыш — 0, за ничью — 1.
    // Известно количество очков, полученных командой за игру.
    // Определить словесный результат игры (выигрыш, проигрыш или ничья).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество очков");
        byte score = sc.nextByte();
        sc.close();

        switch (score) {
            case 0 :
                System.out.println("Проигрыш");
                break;
            case 1 :
                System.out.println("Ничья");
                break;
            case 3 :
                System.out.println("Выигрыш");
                break;
            default:
                System.out.println("Некорректное значение");
                break;
        }

    }
}
