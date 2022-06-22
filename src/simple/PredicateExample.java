package simple;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExample {
//to check the test method in predicate interface
	public void testInPredicate() {

		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);
		// Calling Predicate method
		System.out.println(lesserthan.test(100));
		System.out.println(lesserthan.test(10));
	}
	//to undersatnd the chaining 
	public void predicateChaining(){
		
		 Predicate<Integer> greaterThanTen = (i) -> i > 10;
		 
	        // Creating predicate
	        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
	        boolean result = greaterThanTen.and(lowerThanTwenty).test(25);
	        System.out.println(result);
	 
	        // Calling Predicate method
	        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(25);
	        System.out.println(result2);
	}
	
	static void pred(int number, Predicate<Integer> predicate)
    {
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }
	
	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };
 
    public static void predicate_or()
    {
 
        Predicate<String> containsLetterA = p -> p.contains("B");
        String containsA = "Andmmmmmmmmmmmmmmmmmmm";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
    
    public static void predicate_and()
    {
        Predicate<String> nonNullPredicate = Objects::nonNull;
 
        String nullString = null;
 
        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println("outcome of AND :" +outcome);
 
        String lengthGTThan10 = "i am ayush rohit from samastipurs";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
        test(lengthGTThan10);
        System.out.println(outcome2);
    }
    
    public static void predicate_negate()
    {
 
        String lengthGTThan10 = "Thunderstruck is a 2012 children's "
                                + "film starring Kevin Durant";
 
        boolean outcome = hasLengthOf10.negate().test(lengthGTThan10);
        System.out.println("Outcome in negate function: "+outcome);
    }

	public static void main(String[] args) {
		PredicateExample predicate = new PredicateExample();
		predicate.testInPredicate();
		predicate.predicateChaining();
		pred(109,(i)->i>70);
		predicate_or();
		predicate_and();
		predicate_negate();
	}
}