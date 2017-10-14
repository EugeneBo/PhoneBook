import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        int contactsCount = 0;

        Scanner scann = new Scanner(System.in);
        Contact[] phoneBook = new Contact[20];

        while (true) {

            int menuInput;
            System.out.println("\nMenu: ");
            System.out.println("1 - Add new contact");
            System.out.println("2 - Show contacts");
            System.out.println("3 - Delete contacts");
            System.out.println("4 - Exit");

            System.out.print("\nMake your choice: ");
            menuInput = Integer.parseInt(scann.nextLine());

            if (menuInput == 1) {

                phoneBook[contactsCount] = new Contact();

                System.out.print("\nEnter contact name: ");
                phoneBook[contactsCount].setName(scann.nextLine());
                System.out.print("Enter contact phone: ");
                phoneBook[contactsCount].setPhone(scann.nextLine());
                System.out.print("Enter contact e-mail: ");
                phoneBook[contactsCount].setEmail(scann.nextLine());

                contactsCount++;

            } else if (menuInput == 2) {
                System.out.println("\nContact list: " + "\n");
                for (int i = 0; phoneBook[i] != null; i++) {
                    System.out.println(phoneBook[i]);
                }

            } else if (menuInput == 3) {
                System.out.println("Enter contact name to delete: ");
                String userEnteredName=scann.nextLine();
                for (int i = 0; i < phoneBook.length; i++) {
                    if (phoneBook[i].getName().equals(userEnteredName)) {
                     phoneBook[i]=null;
                     break;
                    }
                }
            } else break;


        }

    }
}
