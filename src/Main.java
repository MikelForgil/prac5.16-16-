import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int random_number = random.nextInt(41) - 20;
        System.out.println(random_number);
    }
}
//Завданя2
public class Main {
    public static void main(String[] args) {
        int a = 3; // перший катет
        int b = 4; // другий катет

        // обчислюємо гіпотенузу
        double c = Math.sqrt(a * a + b * b);

        // обчислюємо площу трикутника
        double area = (a * b) / 2.0;

        // обчислюємо периметр трикутника
        double perimeter = a + b + c;

        // виводимо результати в консоль
        System.out.println("Площа прямокутного трикутника: " + area);
        System.out.println("Периметр прямокутного трикутника: " + perimeter);
    }
}
//Завдання3
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        int digits = String.valueOf(number).length();
        System.out.println("Згенероване число: " + number);
        System.out.println("Кількість цифр у числі: " + digits);
    }
}
//Завдання4
import java.util.Random;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(3) + 1;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ласкаво просимо в гру лотерея!");
        System.out.println("Ви маєте дві спроби, щоб відгадати послідовність трьох чисел від 1 до 3.");
        for (int attempt = 1; attempt <= 2; attempt++) {
            System.out.println("Спроба #" + attempt);
            System.out.print("Введіть перше число (1-3): ");
            int guess1 = scanner.nextInt();
            System.out.print("Введіть друге число (1-3): ");
            int guess2 = scanner.nextInt();
            System.out.print("Введіть третє число (1-3): ");
            int guess3 = scanner.nextInt();
            if (guess1 == numbers[0] && guess2 == numbers[1] && guess3 == numbers[2]) {
                System.out.println("Вітаємо! Ви виграли!");
                return;
            } else {
                System.out.println("На жаль, ви не відгадали. Спробуйте ще раз.");
            }
        }
        System.out.println("Гра закінчилася. Ви програли.");
    }
