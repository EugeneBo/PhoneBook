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
            System.out.println("\n\nCONTACTS COUNT :"+newContactList.numberOfContacts());
            System.out.println("ARRAY LENGTH :" + newContactList.arrayLength());
            /////


            int menuInput = Integer.parseInt(scann.nextLine());


            if (menuInput == 1) {

                newContactList.add(contactDataInput());

            } else if (menuInput == 2) {

                System.out.print("Enter contact index: ");
                int contactIndexToAdd = Integer.parseInt(scann.nextLine());
                newContactList.add(contactIndexToAdd,contactDataInput());


            } else if (menuInput == 3) {
                if (newContactList.numberOfContacts()==0) {
                    System.out.println("\nNo contacts!");
                } else {

                    System.out.println("\nNumber of contacts (" + newContactList.numberOfContacts() + ")\n");

                    for (int i = 0; i < newContactList.arrayLength(); i++) {
                        if (newContactList.get(i)!=null)
                      System.out.println(i+".\n"+newContactList.get(i).toString());

                    }

                }

            }
            else if (menuInput == 4) {
                if (newContactList.numberOfContacts() == 0) {
                    System.out.println("\nNo contacts to delete!");
                } else
                {



                    System.out.println("Enter contact index to delete: ");
                    int index = Integer.parseInt(scann.nextLine());

                    if (index < 0 || index > newContactList.numberOfContacts()) {
                        System.out.println("\nOUT OF BOUNDS!");
                    } else newContactList.remove(index);
                }


            } else break;


        }

    }




}
