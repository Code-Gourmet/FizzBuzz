import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static final String  NOTHING;

    public static final Integer START_INCLUSIVE, END_INCLUSIVE;

    public static final List< BiFunction<Integer, String, String> > RULES;

    static {

        START_INCLUSIVE = 1;
        END_INCLUSIVE = 100;

        NOTHING = "";

        RULES = Arrays.asList(
                (n, s)-> n % 3 == 0 ? "Fizz" : NOTHING,
                (n, s)-> n % 5 == 0 ? "Buzz" : NOTHING,
                (n, s)-> s.isEmpty() ? String.valueOf(n) : NOTHING
        );
    }

    public static void main(String... param){
        IntStream.rangeClosed(START_INCLUSIVE, END_INCLUSIVE).forEach( i -> {
            StringBuilder b = new StringBuilder();
            RULES.forEach(rule -> b.append(rule.apply(i, b.toString())));
            System.out.println(b);
        });
    }
}




