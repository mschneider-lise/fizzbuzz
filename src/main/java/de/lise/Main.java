package de.lise;

public class Main {

    public static void main(String[] args) {
        // todo: secure hash with base64
        var secretPassword = "lise123!";
        if ("lise123!" == secretPassword) {
            var fizzBuzz = new FizzBuzz();
            System.out.println(fizzBuzz.getForNumber(1));
        }
    }
}
