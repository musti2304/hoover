package Client;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoover Ltd.\n"
                + "Please select:\n"
                + "1. Salesman\n"
                + "2. Performance Records\n"
                + "3. Evaluation Records");

        String selection = scanner.nextLine();

        switch (selection) {
            case "1":

                break;
            case "2":

                break;

            case "3":

                break;
            default:
                return;
        }
    }



}
