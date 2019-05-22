import lib.Person;
import lib.PersonFactory;
import predicates.IntegerPredicates;
import predicates.PersonPredicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Example of Predicates with a list of objects
 */
public class Example2 {
    public static void main(String[] args) {
        List<Person> persons = PersonFactory.createPersons();
        List<Person> filteredList = new ArrayList<>();

        System.out.println("\n--------------------------------- Male ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.malePersonPredicate);
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- Female ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.femalePersonPredicate);
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- ZIP 50131 ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.getSpecificZip(50131));
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- Female AND ZIP 50131 ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.getSpecificZip(50131).and(PersonPredicates.femalePersonPredicate));
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- Female OR ZIP 50131 ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.getSpecificZip(50131).or(PersonPredicates.femalePersonPredicate));
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- NOT ZIP 50131 ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.getSpecificZip(50131).negate());
        filteredList.forEach(System.out::println);
        System.out.println("\n--------------------------------- FEMALE AND NOT ZIP 50131 ---------------------------------");
        filteredList = Example2.getFilteredPerson(persons, PersonPredicates.femalePersonPredicate.and(PersonPredicates.getSpecificZip(50131).negate()));
        filteredList.forEach(System.out::println);
    }

    public static List<Person> getFilteredPerson(List<Person> persons, Predicate<Person> personPredicate){
        List<Person> filteredPersons = new ArrayList<>();
        for(Person i : persons){
            if(personPredicate.test(i)){
                filteredPersons.add(i);
            }
        }
        return filteredPersons;
    }
}
