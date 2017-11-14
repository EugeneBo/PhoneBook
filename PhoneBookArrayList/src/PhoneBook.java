import java.util.Scanner;

public class PhoneBook {

    private static Scanner scann = new Scanner(System.in);

    private static Contact contactDataInput(){

        Contact newContact = new Contact();

        System.out.print("\nEnter contact name: ");
        newContact.setName(scann.nextLine());
        System.out.print("Enter contact phone: ");
        newContact.setPhone(scann.nextLine());
        System.out.print("Enter contact e-mail: ");
        newContact.setEmail(scann.nextLine());

        return newContact;
    }


    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);


        ContactList newContactList = new ContactList();

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1 - Add new contact");
            System.out.println("2 - Add new contact by index");
            System.out.println("3 - Show contacts");
            System.out.println("4 - Delete contacts");
            System.out.println("Type any other number to EXIT");
            System.out.print("\nMake your choice: ");


            ///// проверка
            System.out.println("\nCONTATS COUNT "+newContactList.size());
            /////


            int menuInput = Integer.parseInt(scann.nextLine());


            if (menuInput == 1) {

                newContactList.add(contactDataInput());

            } else if (menuInput == 3) {
                if (newContactList.size()==0) {
                    System.out.println("\nNo contacts!");
                } else {

                    System.out.println("\nContact list (" + newContactList.size() + "):\n");

                    for (int i = 0; i <= newContactList.size() - 1; i++) {
                      System.out.println(i+".\n"+newContactList.get(i).toString());

                    }

                }

            }
            else if (menuInput == 4) {
                if (newContactList.size() == 0) {
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
