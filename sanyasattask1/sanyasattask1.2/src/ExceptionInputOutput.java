import java.util.Scanner;
public class ExceptionInputOutput {
    public static void main(String[] args) {

        System.out.println("Введите название цветов в букете: ");
        final Scanner scanner = new Scanner(System.in);
        final String Bouquet = scanner.next(); /* переменную не очень подходящую (FlowerInput) заменяем
         на более абстрактную (Bouquet) которая хранит значение строки
         (название будущего букета из цветов) */

        try {
            if (Bouquet.matches("[a-zA-Z ]*\\d+.*")) {
                throw new IllegalArgumentException("Error: Ввод цифр не приветствуется! ");
            }

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println(); //  вывод на консоль,здесь не уместен

        }

    }

}








