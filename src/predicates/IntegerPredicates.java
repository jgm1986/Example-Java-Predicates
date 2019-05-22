package predicates;

import java.util.function.Predicate;

public class IntegerPredicates {
    //public static Predicate<Integer> positiveIntegerPredicate = new Predicate<Integer>(){
    //
    //
    //    @Override
    //    public boolean test(Integer number) {
    //        return number > 0;
    //    }
    //};
    public static Predicate<Integer> positiveIntegerPredicate = (number -> number > 0);
    public static Predicate<Integer> negativeIntegerPredicate = (number -> number < 0);

    public static Predicate<Integer> getSpecificNumber(Integer argument) {
        return i -> argument == i;
    }
}
