package functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Write a class PhoneBook implementing a phone book as a List<Person>.
 * <p>
 * public static class Person {
 * String name;
 * String lastname;
 * String phone;
 * //...
 * }
 * The class has a single constructor accepting a List<Person> and provides two methods searchByLastname,
 * searchByNameAndLastname returning the first Person instance matching the search criteria. The two methods have the following prototypes:
 * <p>
 * public Optional<Person> searchByLastname(String lastname);
 * public Optional<Person> searchByNameAndLastname(String name, String lastname);
 */
public class PhoneBook {
    final List<Person> people;

    public PhoneBook(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> searchByLastname(String lastname) {
        for (Person p : people) {
            if (p.getLastname().equals(lastname)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        for (Person p : people) {
            if (p.getLastname().equals(lastname) && p.getName().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
