
class ContactList {

    private Contact[] arrayContacts;


    public void add(Contact contact) {

        if (arrayContacts == null) {
            arrayContacts = new Contact[1];
            arrayContacts[0] = contact;
        } else {
            Contact[] temp = arrayContacts;
            arrayContacts = new Contact[arrayContacts.length + 1];
            for (int i = 0; i <= temp.length - 1; i++) {
                arrayContacts[i] = temp[i];
                arrayContacts[arrayContacts.length - 1] = contact;
            }
        }
    }

    public void remove(int index) {

        Contact[] temp = new Contact[arrayContacts.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = arrayContacts[i];
        }

        for (int i = index; i < temp.length; i++) {
            temp[i] = arrayContacts[i + 1];
        }
        arrayContacts = temp;
    }

    public Contact get(int index) {
        return arrayContacts[index];
    }

    public int size() {
        return arrayContacts.length;
    }

    public boolean isEmpty() {
        return arrayContacts == null || arrayContacts.length == 0;
    }


}
