package task22;

import java.util.SortedSet;
import java.util.TreeSet;

public class Comparator {
    static class PersonAgeComparator implements java.util.Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    static class PersonNameComparator implements java.util.Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet();
        persons.add(new Person(17, "Vova"));
        persons.add(new Person(10, "Vova"));
        persons.add(new Person(11, "Vanya"));
        persons.add(new Person(9, "Vanya"));

        System.out.println();

        java.util.Comparator<Person> personComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        persons = new TreeSet(personComparator);
        persons.add(new Person(17, "Vova"));
        persons.add(new Person(10, "Vova"));
        persons.add(new Person(11, "Vanya"));
        persons.add(new Person(9, "Vanya"));
        for (Person person : persons) {
            System.out.println(person.toString());
        }

    }

}

