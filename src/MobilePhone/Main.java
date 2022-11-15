package MobilePhone;

public class Main {

    public static void main(String[] args) {
        MobilePhone mb = new MobilePhone("000000");
        System.out.println(mb.addNewContact(Contact.createContact("Michał", "111111")));
        mb.printContacts();
        System.out.println(mb.addNewContact(Contact.createContact("Michał", "111111")));
        mb.printContacts();

    }
}
