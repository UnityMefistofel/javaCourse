package lesson_06.homework.AppPhBook;

import java.util.Iterator;
import java.util.LinkedList;

public class PhoneBook {
    private LinkedList<Contact> arrContacts = new LinkedList<>();

    public boolean addContact(Contact contact) {
        return arrContacts.add(contact);
    }

    public boolean addContact(String name, String phoneNum, String email) {
        Contact contact = new Contact(name,phoneNum,email);
        return arrContacts.add(contact);
    }

    public void setValueContact(Contact contact, String fieldName, String value) {
        switch (fieldName) {
            case "name" -> contact.setName(value);
            case "phone" -> contact.setPhoneNum(value);
            case "email" -> contact.setEmail(value);
            default -> {}
        }
    }

    public Contact findContact(String fieldName, String value) {
        Iterator<Contact> iter = arrContacts.iterator();
        Contact currElem;

        switch (fieldName) {
            case "name" -> {
                while (iter.hasNext()) {
                    currElem = iter.next();
                    if (currElem.getName().equals(value))
                        return currElem;
                }
            }
            case "phone" -> {
                while (iter.hasNext()) {
                    currElem = iter.next();
                    if (currElem.getPhoneNum().contains(value))
                        return currElem;
                }
            }
            case "email" -> {
                while (iter.hasNext()) {
                    currElem = iter.next();
                    if (currElem.getEmail().contains(value))
                        return currElem;
                }
            }
            default -> { return null; }
        }

        return null;
    }

    public Contact getFirstContact() {
        return arrContacts.getFirst();
    }

    public Contact getLastContact() {
        return arrContacts.getLast();
    }

    public void deleteContact(Contact contact) {
        arrContacts.remove(contact);
    }

    public void printList() {
        Contact elem;
        Iterator<Contact> iter = arrContacts.iterator();
        while (iter.hasNext()) {
            elem = iter.next();
            System.out.println(elem.getName() + " " +
                    elem.getPhoneNum() + " " +
                    elem.getEmail());

        }
    }

    public void printContact(Contact contact) {
        System.out.println("\nТекущий элемент: " + contact.getName() + " " +
                            contact.getPhoneNum() + " " +
                            contact.getEmail());

    }

}
