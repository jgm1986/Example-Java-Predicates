import predicates.IntegerPredicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Example of Predicates with a list of entities
 */
public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -7, -10, 1, 2, 3, 4, 6, 8, 9, 0, 12, 44, 87);
        /**
         * We want filter these number if they are positive or negative
          */
        // Filter if the numbers are positive
        List<Integer> filteredNumbers = getFilteredNumber(numbers, IntegerPredicates.positiveIntegerPredicate);
        System.out.println("Printing positive values:");
        filteredNumbers.forEach(System.out::println);
        filteredNumbers = getFilteredNumber(numbers, IntegerPredicates.negativeIntegerPredicate);
        System.out.println("\nPrinting negative values:");
        filteredNumbers.forEach(System.out::println);
        filteredNumbers = getFilteredNumber(numbers, IntegerPredicates.getSpecificNumber(12));
        System.out.println("\nPrinting values equals to 12:");
        filteredNumbers.forEach(System.out::println);

    }

    public static List<Integer> getFilteredNumber(List<Integer> numbers, Predicate<Integer> integerPredicate){
        List<Integer> filteredNumbers = new ArrayList<>();
        for(Integer i : numbers){
            if(integerPredicate.test(i)){
                filteredNumbers.add(i);
            }
        }
        return filteredNumbers;
    }
}
