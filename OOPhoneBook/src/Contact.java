
public class Contact {
    private String name;
    private String phone;
    private String email;

    public void setName(String name) {

        this.name = name;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getName(){
        return name;
    }

//    public void showContact() {
//        System.out.println("Name: " + name);
//        System.out.println("Phone: " + phone);
//        System.out.println("E-mail: " + email + "\n");
//    }
    public String toString() {
        return ("Name: "+ name + "\n" + "Phone: " + phone + "\n" +"E-mail: " + email + "\n");
    }

    public void deleteContact() {
        name = null;
        phone = null;
        email = null;
    }

}
