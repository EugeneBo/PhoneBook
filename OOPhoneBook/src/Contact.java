
public class Contact {
    String name, phone, email;

    public void setName(String n) {
        name = n;
    }

    public void setPhone(String p) {
        phone = p;
    }

    public void setEmail(String e) {
        email = e;
    }

    public void showContact (){
        System.out.println("Name: "+ name);
        System.out.println("Phone: "+ phone);
        System.out.println("E-mail: "+ email +"\n");
    }

}
