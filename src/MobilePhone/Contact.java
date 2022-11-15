package MobilePhone;

import java.util.ArrayList;

public class Contact {

    //  Implement the Contact class with the following attributes:
    //        -  Two fields, both String, one called name and the other phoneNumber.
    //        -  A constructor that takes two Strings, and initialises name and phoneNumber.
    //        -  And Three methods, they are:
    //        -  getName(), getter for name.
    //        -  getPhoneNumber(), getter for phoneNumber.
    //        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}
