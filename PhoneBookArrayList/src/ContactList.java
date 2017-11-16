public class ContactList {

    private Contact[] contacts = new Contact[10];
    private int contactsCounter = 0;

     void add(Contact contact) {

        if (contacts == null) {
            contacts[0] = contact;
            contactsCounter++;
        } else {
            contacts[contactsCounter] = contact;
            contactsCounter++;
        }
        enlargingArray();
    }

     void add(int index, Contact contact) {
        System.arraycopy(contacts, index, contacts, index + 1, contactsCounter - index);
        contacts[index] = contact;
        contactsCounter++;
        enlargingArray();
    }

    private void enlargingArray() {
        if (arrayLength() == numberOfContacts()) {
            Contact[] temp = new Contact[((arrayLength()*3)/2)+1];
            System.arraycopy(contacts, 0, temp, 0, arrayLength());
            contacts = temp;
        }
    }

     void remove(int index) {
        System.arraycopy(contacts, index + 1, contacts, index, contactsCounter - index - 1);
        contactsCounter--;
    }

     Contact get(int index) {
        return contacts[index];
    }

     int numberOfContacts() {
        return contactsCounter;
    }

     int arrayLength() {
        return contacts.length;
    }

    public boolean isEmpty() {
        return contacts == null || contacts.length == 0;
    }

}
