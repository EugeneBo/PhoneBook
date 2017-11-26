public class ContactList {

    private Contact[] contacts = new Contact[10];
    private int contactsCounter = 0;
    private boolean sorted = false;

    public void add(Contact contact) {
        contacts[contactsCounter] = contact;
        contactsCounter++;
        enlargingArray();
        sorted = false;
    }

    public void add(int index, Contact contact) {
        System.arraycopy(contacts, index, contacts, index + 1, contactsCounter - index);
        contacts[index] = contact;
        contactsCounter++;
        enlargingArray();
        sorted = false;
    }

    private void enlargingArray() {
        if (contacts.length == numberOfContacts()) {
            Contact[] temp = new Contact[((contacts.length * 3) / 2) + 1];
            System.arraycopy(contacts, 0, temp, 0, contacts.length);
            contacts = temp;
        }
    }

    private void reductionArray() {
        if (arrayLength() - numberOfContacts() > (0.7 * arrayLength()) && arrayLength() - numberOfContacts() > 10) {
            Contact[] temp = new Contact[contacts.length - (contacts.length / 2) - 1];
            System.arraycopy(contacts, 0, temp, 0, numberOfContacts());
            contacts = temp;
        }
    }

    public void sort() {
        if (!sorted) {
            for (int i = numberOfContacts() - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (contacts[j].getFirstNameLetter() > contacts[j + 1].getFirstNameLetter()) {
                        Contact buffer = contacts[j];
                        contacts[j] = contacts[j + 1];
                        contacts[j + 1] = buffer;
                    }
                }
            }
            sorted = true;
        }
    }

    public void remove(int index) {
        System.arraycopy(contacts, index + 1, contacts, index, contactsCounter - index);
        contactsCounter--;
        reductionArray();
        sorted = false;
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

}
