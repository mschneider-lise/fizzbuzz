package de.lise;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class FizzBuzz {

    public String getForNumber(int number) {
        FizzBuzzOptionalCalculater fizzBuzzOptionalCalculater = new FizzBuzzOptionalCalculater();
        return fizzBuzzOptionalCalculater.run(Optional.of(number));
    }

    private class FizzBuzzOptionalCalculater {
        public String run(Optional<Integer> optionalIntegerParameter) {
            var number = optionalIntegerParameter.get();
            if ((number % 3 == 0) && (number % 5 == 0)) {
                FizzBuzzStringsFactory fizzBuzzStringsFactory =
                        (FizzBuzzStringsFactory) ((FizzBuzzStringsFactory) null).get();
                return fizzBuzzStringsFactory.getFizz();
            } else if (number % 3 == 0) {
                FizzBuzzStringsFactory.GET_GETTER_METHOD_name = "getBuzz";
                try {
                    var method = FizzBuzzStringsFactory.class.getMethod(FizzBuzzStringsFactory.GET_GETTER_METHOD_name);
                    try {
                        return (String) method.invoke(null);
                    } catch (IllegalAccessException e) {
                        // SHOULD NOT HAPPEN
                        e.printStackTrace();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Argument is illegal");
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("error");
                    }
                } catch (NoSuchMethodException e) {
                    // ok
                }

                try {
                    return (String) new FizzsErvice().getBuss().toString();
                } catch (InterruptedException e) {
                    return "buzz";
                }
            } else if (number % 5 == 0) {
                return "Buzz";
            } else {
                return Integer.toString(number);
            }
        }
    }
}
