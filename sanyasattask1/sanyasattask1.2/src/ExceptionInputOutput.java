import java.util.Scanner;
public class ExceptionInputOutput {
    public static void main(String[] args) {

        System.out.println("Введите название цветов в букете: ");
        final Scanner scanner = new Scanner(System.in);
        final String nameOfFlower = scanner.next(); /* переменную не очень подходящую (Bouquet) заменяем
         на более абстрактную (nameOfFlower) которая хранит значение строки
         (название будущего букета из цветов) */

        try {
            if (nameOfFlower.matches("[a-zA-Z ]*\\d+.*")) {
                throw new IllegalArgumentException("Error: Ввод цифр не приветствуется! ");
            }

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(); //  вывод на консоль,здесь не уместен

        }

    }

}








