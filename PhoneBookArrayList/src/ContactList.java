public class ContactList {

    private Contact[] contacts = new Contact[4];
    private int contactsCounter = 0;

    public void add(Contact contact) {

        if (contacts == null) {
            contacts[0] = contact;
            contactsCounter++;
        } else {
            contacts[contactsCounter] = contact;
            contactsCounter++;
        }
        enlargingArray();
    }

    public void add(int index, Contact contact) {
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

    public void remove(int index) {
        System.arraycopy(contacts, index + 1, contacts, index, contactsCounter - index - 1);
        contactsCounter--;
    }

    public Contact get(int index) {
        return contacts[index];
    }

    public int numberOfContacts() {
        return contactsCounter;
    }

    public int arrayLength() {
        return contacts.length;
    }

    public boolean isEmpty() {
        return contacts == null || contacts.length == 0;
    }

}
