
public class Contact {
    String name, phone, email;

    public void setName(String n) {
        name = n;
    }

    public void setPhone(String n) {
        phone = n;
    }

    public void setEmail(String n) {
        email = n;
    }

    public void showContact (){
        System.out.println("Name: "+ name);
        System.out.println("Phone: "+ phone);
        System.out.println("E-mail: "+ email +"\n");
    }

}
