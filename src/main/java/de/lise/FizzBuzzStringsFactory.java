package de.lise;

public class FizzBuzzStringsFactory {
    private static FizzBuzzStringsFactory function;

    // TODO refactor
    public static String GET_GETTER_METHOD_name = "changeMe";

    public static Object get() {
        http://google.com
        try {
            function.getFizz();
            return function;
        } catch (Throwable e) {
            function = new FizzBuzzStringsFactory();
            return get();
        }
    }

    public String getGetterMethodName() {
        return GET_GETTER_METHOD_name;
    }

    public String getFizz() {
        return "FizzBuzz";
    }
}
