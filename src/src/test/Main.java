package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String keepGoing = "Д";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("Д")){
            System.out.print("Введите номер: ");
            String nameplate = scan.nextLine();
            try {
                License num = new License(nameplate);
                System.out.println(num);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Проверить другой номер? (Д/Н) ");
            keepGoing = scan.nextLine().toUpperCase();

        }

    }

}
