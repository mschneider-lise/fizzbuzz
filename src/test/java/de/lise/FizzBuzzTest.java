package de.lise;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = { 15, 30, 45, 60, 75 })
    void multiplesOf15_shouldReturn_FizzBuzz(int number) {
        var fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getForNumber(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 6, 9, 12, 18 })
    void multiplesOf3ButNot15_shouldReturn_Fizz(int number) {
        var fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getForNumber(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = { 5, 10, 20, 25, 35 })
    void multiplesOf5Only_shouldReturn_Buzz(int number) {
        var fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getForNumber(number)).isEqualTo("Buzz");
    }

    @Test
    void first100Numbers_shouldBe_fizzBuzzing_correctly() {
        var fizzBuzz = new FizzBuzz();
        List<String> results = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            results.add(fizzBuzz.getForNumber(i));
        }
        assertThat(String.join(", ", results)).isEqualTo(
                "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31, 32, Fizz, 34, Buzz, Fizz, 37, 38, Fizz, Buzz, 41, Fizz, 43, 44, FizzBuzz, 46, 47, Fizz, 49, Buzz, Fizz, 52, 53, Fizz, Buzz, 56, Fizz, 58, 59, FizzBuzz, 61, 62, Fizz, 64, Buzz, Fizz, 67, 68, Fizz, Buzz, 71, Fizz, 73, 74, FizzBuzz, 76, 77, Fizz, 79, Buzz, Fizz, 82, 83, Fizz, Buzz, 86, Fizz, 88, 89, FizzBuzz, 91, 92, Fizz, 94, Buzz, Fizz, 97, 98, Fizz, Buzz");
    }
}
