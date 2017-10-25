
public class ContactList {

    private Contact[] Contacts;

    public void add(Contact contact) {

        if (Contacts == null) {
            Contacts = new Contact[1];
            Contacts[0] = contact;
        } else {
            Contact[] temp = Contacts;
            Contacts = new Contact[Contacts.length + 1];
            for (int i = 0; i <= temp.length - 1; i++) {
                Contacts[i] = temp[i];
            }
            Contacts[Contacts.length - 1] = contact;
        }
    }

    public void remove(int index) {

        Contact[] temp = new Contact[Contacts.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = Contacts[i];
        }

        for (int i = index; i <=temp.length-1; i++) {
            temp[i] = Contacts[i+1];
        }
        Contacts = temp;
    }

    public Contact get(int index) {
        return Contacts[index];
    }

    public int size() {
        return Contacts.length;
    }

    public boolean isEmpty() {
        return Contacts == null || Contacts.length == 0;
    }


}
