package array;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String string) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (Objects.equals(contact.getName(), string) || Objects.equals(contact.getPhoneNumber(), string)) return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (Objects.equals(contact.getName(), name)) return contact;
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        int index = 1;
        for (var contact : myContacts) {
            System.out.println(index + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            index++;

        }
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "myNumber='" + myNumber + '\'' +
                ", myContacts=" + myContacts +
                '}';
    }
}
