package br.com.bianeck.stream.reduce.exemplo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class JavaReduceEx4 {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Frank", LocalDate.of(1979, 11, 23)),
                new User("Peter", LocalDate.of(1985, 1, 18)),
                new User("Lucy", LocalDate.of(2002, 5, 14)),
                new User("Albert", LocalDate.of(1996, 8, 30)),
                new User("Frank", LocalDate.of(1967, 10, 6))
        );

        int maxAge = users.stream().mapToInt(User::getAge)
                .reduce(0, (a1, a2) -> a1 > a2 ? a1 : a2);

        System.out.printf("The oldest user's age: %s%n", maxAge);

    }
}
