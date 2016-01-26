
import java.util.Scanner;

 class NumberException extends ExceptionInputOutput {
     public static void main(String[] args) {
         System.out.println("Введите колличество цветов: ");
         final Scanner scanner = new Scanner(System.in);
         final String numberOf = scanner.next();/* изменяем переменную (number) на переменую,
          более правильную, передающую более понятный смысл (numberOf)*/

         try {
             final int number = Integer.parseInt(numberOf);/* переменная (i) которая хранит числовое значение
              введённое пользователем передаваемая на консоль , заменил на более понятную переменную  */

             System.out.println(" Спасибо, вы ввели: " + number);

         } catch (NumberFormatException e) {
             System.out.println("Error: "+ e.toString() +" ввод букв не приветствуется! ");


         }

     }

 }
