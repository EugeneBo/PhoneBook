import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        ContactList newContactList = new ContactList();

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

                Contact newContact = new Contact();

                System.out.print("\nEnter contact name: ");
                newContact.setName(scann.nextLine());
                System.out.print("Enter contact phone: ");
                newContact.setPhone(scann.nextLine());
                System.out.print("Enter contact e-mail: ");
                newContact.setEmail(scann.nextLine());

                newContactList.add(newContact);

            } else if (menuInput == 2) {
                if (newContactList.isEmpty()) {
                    System.out.println("\nNo contacts!");
                } else {

                    System.out.println("\nContact list (" + newContactList.size() + "):\n");

                    for (int i = 0; i <= newContactList.size() - 1; i++) {
                        System.out.println(newContactList.get(i).toString());
                    }

                }

            }
            else if (menuInput == 3) {
                if (newContactList.isEmpty()) {
                    System.out.println("\nNo contacts to delete!");
                } else {
                    System.out.println("Enter contact index to delete: ");
                    int index = Integer.parseInt(scann.nextLine());
                    newContactList.remove(index);
                }


            } else break;


        }

    }
}
