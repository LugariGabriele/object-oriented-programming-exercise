package oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    static final int MAX_PERSONS = 256;
    ArrayList<Person> phoneBook;


    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person person) {
    if (phoneBook.contains(person)){
        return false;
    }
    if (phoneBook.size()>=MAX_PERSONS){
        return false;
    }

        return phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp= new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
        if (phoneBook.get(i).getLastname().equals(lastname)){
        tmp.add(phoneBook.get(i));
}
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person p : phoneBook) {
            if (p.getLastname().equals(lastname) && p.getName().equals(name)) {
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }
}
