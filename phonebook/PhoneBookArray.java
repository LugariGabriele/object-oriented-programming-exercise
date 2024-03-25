package oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(person)) {
                return false;
            }
        }

        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = person;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person person) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].equals(person)) {
                    phoneBook[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int k = 0;
        Person[] tmp = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].getLastname().equals(lastname)) {
                    tmp[k] = phoneBook[i];
                    k++;
                }
            }
        }
        return Arrays.copyOf(tmp, k);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        int k = 0;
        Person[] tmp = new Person[MAX_PERSONS];
        for (int i = 0; i < MAX_PERSONS; i++) {
            if (phoneBook[i] != null) {
                if (phoneBook[i].getName().equals(name) && phoneBook[i].getLastname().equals(lastname)) {
                    tmp[k++] = phoneBook[i];
                }
            }
        }
        return Arrays.copyOf(tmp, k);
    }
}
