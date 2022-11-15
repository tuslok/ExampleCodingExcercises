package MobilePhone;


import java.util.ArrayList;

public class MobilePhone {
    // 1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
    //    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    //    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    //    -  And seven methods, they are (their functions are in their names):

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // addNewContact(), has one parameter of type Contact and returns a boolean.
    // Returns true if the contact doesn't exists, or false if the contact already exists.

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact) != -1) {
            return false;
        } else {
            return myContacts.add(newContact);
        }
    }

    // updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean.
    // Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != 1) {
            int value = myContacts.indexOf(oldContact);
            myContacts.set(value, newContact);
            return true;
        }
        return false;
    }

    // removeContact(), has one parameter of type Contact and returns a boolean.
    // Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.

    public boolean removeContact(Contact deleteContact) {
        if (findContact(deleteContact) != -1) {
            return myContacts.remove(deleteContact);
        }
        return false;
    }


    // findContact(), has one parameter of type Contact and returns an int.
    // The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).

    private int findContact(Contact queryContact) {
        return findContact(queryContact.getName());
    }

    // findContact(), same as above, only it has one parameter of type String.

    private int findContact(String queryContact) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(queryContact)) {
                return i;
            }
        }
        return -1;
    }

    // queryContact(), has one parameter of type String and returns a Contact.
    // Use the String to search for the name and then return the Contact. Return null otherwise.

    public Contact queryContact(String queryName) {
        if (!myContacts.isEmpty()) {
            for (int i = 0; i < myContacts.size(); i++) {
                Contact contact = myContacts.get(i);
                if (contact.getName().equals(queryName)) {
                    return contact;
                }
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        if (!(myContacts.size() == 0)) {
            for (int i = 0; i < myContacts.size(); i++) {
                Contact contact = myContacts.get(i);
                System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            }
        } else {
            System.out.println("Missing contacts..");
        }
    }
}
