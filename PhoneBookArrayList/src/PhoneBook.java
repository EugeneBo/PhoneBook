import java.util.Scanner;

public class PhoneBook {

    private static Scanner scann = new Scanner(System.in);

    private static Contact contactDataInput() {

        System.out.print("\nEnter contact name: ");
        String name = scann.nextLine();
        System.out.print("Enter contact phone: ");
        String phone = scann.nextLine();
        System.out.print("Enter contact e-mail: ");
        String email = scann.nextLine();

        return new Contact(name, phone, email);
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

            System.out.println("\nCONTACTS COUNT :" + newContactList.numberOfContacts());
            System.out.println("ARRAY LENGTH :" + newContactList.arrayLength());

            System.out.print("\nMake your choice: ");


            int menuInput = Integer.parseInt(scann.nextLine());

            if (menuInput == 1) { //упорядоченное добавление контактов

                newContactList.add(contactDataInput());

            } else if (menuInput == 2) {//добавление контакта по индексу
                System.out.print("Enter contact index: ");
                int contactIndexToAdd = Integer.parseInt(scann.nextLine());
                newContactList.add(contactIndexToAdd, contactDataInput());

            } else if (menuInput == 3) { //Вывод контактов на экран
                if (newContactList.numberOfContacts() == 0) {
                    System.out.println("\nNo contacts!");
                } else {

                    newContactList.sort();

                    for (int i = 0; i < newContactList.arrayLength(); i++) {
                        if (newContactList.get(i) != null)
                            System.out.println(i + ".\n" + newContactList.get(i).toString());
                    }
                }

            } else if (menuInput == 4) { //удаление контактов по индексу
                if (newContactList.numberOfContacts() == 0) {
                    System.out.println("\nNo contacts to delete!");
                } else {

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


/*Вопросы:
1) keySet(); entrySet(); почему нету valueSet();?
2) итераторы
3) еще задания на коллекции (тяжело идет)
4) почему коллекиця не должна заниматься сортировкой?
5) Инициализирую объект Contact через конструктор. Нужно ли? Ведь есть сеттер.

*/