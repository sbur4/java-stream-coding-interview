package com.epam.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
        task10();
    }

    private static void task1() {
        // Q: Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        // A:
        Optional<String> longestString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);
    }

    private static void task2() {
        // Q: Calculate the average age of a list of Person objects using Java streams:
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        // A:
        double averageAge = persons.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(averageAge);
    }

    private static void task3() {
        // Q: Check if a list of integers contains a prime number using Java streams:
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        // A:
        boolean containsPrime = numbers.stream()
                .anyMatch(Main::isPrime);

        System.out.println(containsPrime);
    }

    private static void task4() {
        // Q: Merge two sorted lists into a single sorted list using Java streams:
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        // A:
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(mergedList);
    }

    private static void task5() {
        // Q: Find the intersection of two lists using Java streams:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        // A:
        List<Integer> intersection = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(intersection);
    }

    private static void task6() {
        // Q: Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        // A:
        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNumbers);
    }

    private static void task7() {
        // Q: Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
//        List<Transaction> transactions = Arrays.asList(
        List<Person> transactions = Arrays.asList(
                new Person("2022-01-01", 100),
                new Person("2022-01-01", 200),
                new Person("2022-01-02", 300),
                new Person("2022-01-02", 400),
                new Person("2022-01-03", 500)
        );

        // A:
        Map<String, Integer> sumByDay = transactions.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));

        System.out.println(sumByDay);
    }

    private static void task8() {
        // Q: Find the kth smallest element in an array using Java streams:
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element

        // A:
        int kthSmallest = Arrays.stream(array)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElse(-1);

        System.out.println(kthSmallest);
    }

    private static void task9() {
        // Q: Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        // A:
        Map<String, Long> wordFrequency  = words.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);
    }

    private static void task10() {
        // Q: Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // A:
        Map<Boolean, List<Integer>> partitioned = numbers
                .stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
