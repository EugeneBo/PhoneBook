public class ContactList {

    private Contact[] contacts = new Contact[10];
    private int contactsCounter = 0;

    public void add(Contact contact) {
        contacts[contactsCounter] = contact;
        contactsCounter++;
        enlargingArray();
    }

    public void add(int index, Contact contact) {
        System.arraycopy(contacts, index, contacts, index + 1, contactsCounter - index);
        contacts[index] = contact;
        contactsCounter++;
        enlargingArray();
    }

    private void enlargingArray() {
        if (contacts.length == numberOfContacts()) {
            Contact[] temp = new Contact[((contacts.length * 3) / 2) + 1];
            System.arraycopy(contacts, 0, temp, 0, contacts.length);
            contacts = temp;
        }
    }

    private void reductionArray() {
        if (arrayLength()-numberOfContacts()>(0.7*arrayLength()) && arrayLength()-numberOfContacts()>10) {
            Contact[] temp = new Contact[contacts.length - (contacts.length/2)-1];
            System.arraycopy(contacts, 0, temp, 0, numberOfContacts());
            contacts = temp;
        }
    }

    public void sort() {
        Contact[] sortedArray = new Contact[contactsCounter];

        System.arraycopy(contacts,0, sortedArray,0,contactsCounter);

        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j].getFirstNameLetter() > sortedArray[j + 1].getFirstNameLetter()) {
                    Contact buffer = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = buffer;
                }
            }
        }
        System.arraycopy(sortedArray,0,contacts,0,contactsCounter);
    }

    public void remove(int index) {
        System.arraycopy(contacts, index + 1, contacts, index, contactsCounter - index);
        contactsCounter--;
        reductionArray();
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
