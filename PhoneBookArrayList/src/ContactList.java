

public class ContactList {

    private Contact[] Contacts;
    private int contactsCounter = 0;

    public void add(Contact contact) {

        if (Contacts == null) {
            Contacts = new Contact[10];
            Contacts[0] = contact;
            contactsCounter++;
        } else {
            //Contact[] temp = Contacts;

            // Contacts = new Contact[Contacts.length + 1];

            //System.arraycopy(temp,0,Contacts,0,temp.length);

            Contacts[contactsCounter] = contact;

            contactsCounter++;
        }
    }


    public void add(int index, Contact contact) {
        Contact[] temp = new Contact[Contacts.length + 1];

        System.arraycopy(Contacts, 0, temp, 0, index);
        temp[index] = contact;

        System.arraycopy(Contacts, index, temp, index + 1, Contacts.length - index);

        Contacts = temp;
    }


    public void enlargingArray() {


    }


    public void remove(int index) {

        //Contact[] temp = new Contact[Contacts.length - 1];
        //System.arraycopy(Contacts,0,temp,0,index);
        //System.arraycopy(Contacts,index+1,temp,index,Contacts.length-(index+1));
        //Contacts = temp;
       // if (contactsCounter > 0) {

            for (int i = index; i < contactsCounter - 1; i++) {
                Contacts[i] = Contacts[i + 1];
            }
            contactsCounter--;
        //} else System.out.println("No contacts to delete!");
    }


    public Contact get(int index) {
        return Contacts[index];
    }

    public int size() {

        return contactsCounter;
    }   //переписать так, чтобы возвращал фактическое число контактов в массиве, а не размер самого массива

    public boolean isEmpty() {
        return Contacts == null || Contacts.length == 0;
    }


}
