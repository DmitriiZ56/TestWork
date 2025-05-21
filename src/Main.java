import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число, Бро");
        int range = 100;
        int number = (int) (Math.random() * range);
        int i = 0;
        while (true) {
            i++;
            System.out.println("Угадай число от 0 до " + range);
            int input_namber = scanner.nextInt();
            if (input_namber == number) {
                System.out.println ("Ты угадал, Бро");
                break;
            } else if (input_namber > number) {
                System.out.println ("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else {
                System.out.println ("Я сам в шоке, но, загаданное число больше, брат");
            }
        }
        System.out.println("Количество попыток - "+i);
        scanner.close();
    }
}
