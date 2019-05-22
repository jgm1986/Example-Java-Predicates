package predicates;

import lib.Gender;
import lib.Person;

import java.util.function.Predicate;

public class PersonPredicates {
    public static Predicate<Person> malePersonPredicate=person -> person.getGender().equals(Gender.MALE);
    public static Predicate<Person> femalePersonPredicate=person -> person.getGender().equals(Gender.FEMALE);

    public static Predicate<Person> getSpecificZip (int argument){
        return i -> i.getAreaCode() == argument;
    }
}
