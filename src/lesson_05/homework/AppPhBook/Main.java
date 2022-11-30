package lesson_05.homework.AppPhBook;


import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void printContactList(PhoneBook phoneBook) {
        phoneBook.printList();
    }

    public static void printContact(PhoneBook phoneBook, Contact contact) {
        if (contact != null)
            phoneBook.printContact(contact);
    }

    public static Contact addNewContact(PhoneBook phoneBook) {
        Contact currContact = new Contact();
        String inputStr = "";

        while (inputStr.trim().isEmpty()) {
            System.out.println("Введите имя нового контакта (обязательное поле. не может быть пустым):");
            inputStr = input.next();
        }
        currContact.setName(inputStr);

        inputStr = "";
        while (inputStr.trim().isEmpty()) {
            System.out.println("Введите номер телефона нового контакта (обязательное поле. не может быть пустым):");
            inputStr = input.next();
        }
        currContact.setPhoneNum(inputStr);

        inputStr = "";
        System.out.println("Введите адрес эл.почты нового контакта:");
        inputStr = input.next();
        currContact.setEmail(inputStr);

        if (phoneBook.addContact(currContact)) {
            return phoneBook.getLastContact();
        } else {
            return null;
        }
    }

    public static Contact findExistContact(PhoneBook phoneBook) {
        boolean exitflag = false;
        String inputStr = "";
        Contact currContact = null;

        while (!exitflag) {
            System.out.println("  = Поиск контакта =  ");
            System.out.println("1- По имени");
            System.out.println("2- По номеру телефона *");
            System.out.println("3- По эл.адресу *");
            System.out.println("0- вернуться в главное меню");

            input.reset();
            int menu = input.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("Введите имя: ");
                    inputStr = input.next();
                    currContact = phoneBook.findContact("name", inputStr);
                    if (currContact != null)
                        exitflag = true;
                }
                case 2 -> {
                    System.out.print("Введите номер телефона или его часть: ");
                    inputStr = input.next();
                    currContact = phoneBook.findContact("phone", inputStr);
                    if (currContact != null)
                        exitflag = true;
                }
                case 3 -> {
                    System.out.print("Введите адрес эл.почты или ее часть: ");
                    inputStr = input.next();
                    currContact = phoneBook.findContact("email", inputStr);
                    if (currContact != null)
                        exitflag = true;
                }
                case 0 -> exitflag = true;

            }
        }
        return currContact;
    }

    public static Contact setupExistContact(PhoneBook phoneBook, Contact contact) {
        boolean exitflag = false;
        String inputStr;
        //Contact currContact = null;

        while (!exitflag) {
            printContact(phoneBook, contact);
            System.out.println("  = Редактор контакта =  ");
            System.out.println("1- Изменить имя");
            System.out.println("2- Изменить номер телефона");
            System.out.println("3- Изменить эл.адрес");
            System.out.println("0- вернуться в главное меню");

            int menu = input.nextInt();

            switch (menu) {
                case 1 -> {
                    inputStr = "";
                    while (inputStr.trim().isEmpty()) {
                        System.out.println("Введите новое имя контакта (обязательное поле. не может быть пустым):");
                        inputStr = input.next();
                    }
                    phoneBook.setValueContact(contact,"name", inputStr);
                }
                case 2 -> {
                    inputStr = "";
                    while (inputStr.trim().isEmpty()) {
                        System.out.println("Введите новый номер телефона контакта (обязательное поле. не может быть пустым):");
                        inputStr = input.next();
                    }
                    phoneBook.setValueContact(contact,"phone", inputStr);
                }
                case 3 -> {
                    System.out.print("Введите новый адрес эл.почты: ");
                    inputStr = input.next();
                    phoneBook.setValueContact(contact,"email", inputStr);
                }
                case 0 -> exitflag = true;

            }
        }
        return contact;
    }

    public static void main(String[] args) {
        boolean exitflag = false;
        Contact currContact = null;

        Contact john = new Contact("John", "347-517-5379","jonhdoe@gmail.com");
        Contact simon = new Contact("Simon", "347-517-8427","simka98@gmail.com");
        Contact jess = new Contact("Jessika", "485-768-9018","jdoll.mail@gmail.com");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(john);
        phoneBook.addContact(simon);
        phoneBook.addContact("Jack", "950-863-9245","j.daniels@gmail.com");
        phoneBook.addContact("Peter", "347-431-4530","ppforever@gmail.com");
        phoneBook.addContact(jess);


        // Let's get started

        while (!exitflag) {

            printContact(phoneBook, currContact);
            System.out.println("  = Главное меню =  ");
            System.out.println("1- Добавить новый контакт");
            System.out.println("2- Выбрать существующий контакт");
            System.out.println("3- Вывести список существующих контактов");
            if (currContact != null) {
                System.out.println("4- Изменить выбранный нонтакт");
                System.out.println("5- удалить выбранный контакт");
            }
            System.out.println("0- Выход из программы");
            int menu = input.nextInt();

            switch (menu) {
                case 1 -> currContact = addNewContact(phoneBook);
                case 2 -> {
                    Contact tmp = findExistContact(phoneBook);
                    currContact = tmp != null ? tmp : currContact;
                }
                case 3 -> printContactList(phoneBook);
                case 4 -> {
                    if (currContact != null)
                        currContact = setupExistContact(phoneBook, currContact);
                }
                case 5 -> {
                    if (currContact != null) {
                        phoneBook.deleteContact(currContact);
                        currContact = null;
                    }
                }
                case 0 -> exitflag = true;

            }
        }
    }
}
