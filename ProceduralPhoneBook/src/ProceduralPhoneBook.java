import java.util.Scanner;

public class ProceduralPhoneBook {

    public static void main(String[] args) {

        int menuInput;
        int contactsCount = 0;

        Scanner scann = new Scanner(System.in);
        String[] names = new String[20];

        while (true) {


            System.out.println("\nMenu: ");
            System.out.println("1 - Add new contact");
            System.out.println("2 - Show contacts");
            System.out.println("3 - Exit");

            System.out.print("\nMake your choice: ");
            menuInput = Integer.parseInt(scann.nextLine());

            if (menuInput == 1) {
                System.out.print("\nEnter contact name: ");

                names[contactsCount] = scann.nextLine();
                contactsCount++;

            } else if (menuInput == 2) {
                System.out.println("\nContact list: ");
                for (int i = 0; names[i] != null; i++) {
                    System.out.println((i + 1) + ". " + names[i]);
                }

            } else break;


        }


    }
}
