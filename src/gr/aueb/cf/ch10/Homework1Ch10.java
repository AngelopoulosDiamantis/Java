package gr.aueb.cf.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Homework1Ch10 {
    public static void main(String[] args) {
        int[] numbers = readNumbersFromFile("C:/Users/User/Desktop/Java/numbers.txt");
        if (numbers != null) {
            Arrays.sort(numbers);
            List<int[]> validCombinations = generateAndFilterCombinations(numbers);
            writeCombinationsToFile(validCombinations, "C:/Users/User/Desktop/Java/valid_combinations.txt");
        }
    }

    public static int[] readNumbersFromFile(String filename) {
        List<Integer> numbersList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 49) {
                    numbersList.add(number);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return null;
        }
        return numbersList.stream().mapToInt(i -> i).toArray();
    }

    public static List<int[]> generateAndFilterCombinations(int[] numbers) {
        List<int[]> validCombinations = new ArrayList<>();
        int n = numbers.length;
        for (int i = 0; i < n - 5; i++) {
            for (int j = i + 1; j < n - 4; j++) {
                for (int k = j + 1; k < n - 3; k++) {
                    for (int l = k + 1; l < n - 2; l++) {
                        for (int m = l + 1; m < n - 1; m++) {
                            for (int o = m + 1; o < n; o++) {
                                int[] combination = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[o]};
                                if (passesFilters(combination)) {
                                    validCombinations.add(combination);
                                }
                            }
                        }
                    }
                }
            }
        }
        return validCombinations;
    }

    public static boolean passesFilters(int[] combination) {
        return !hasTooManyEven(combination) && !hasTooManyOdd(combination)
                && !hasTooManyConsecutive(combination) && !hasTooManySameEnding(combination)
                && !hasTooManyInSameDecade(combination);
    }

    public static boolean hasTooManyEven(int[] combination) {
        int evenCount = 0;
        for (int num : combination) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount > 4;
    }

    public static boolean hasTooManyOdd(int[] combination) {
        int oddCount = 0;
        for (int num : combination) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount > 4;
    }

    public static boolean hasTooManyConsecutive(int[] combination) {
        int consecutiveCount = 0;
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] == combination[i - 1] + 1) {
                consecutiveCount++;
            }
        }
        return consecutiveCount > 2;
    }

    public static boolean hasTooManySameEnding(int[] combination) {
        int[] endingCounts = new int[10];
        for (int num : combination) {
            endingCounts[num % 10]++;
        }
        for (int count : endingCounts) {
            if (count > 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasTooManyInSameDecade(int[] combination) {
        int[] decadeCounts = new int[5];
        for (int num : combination) {
            decadeCounts[num / 10]++;
        }
        for (int count : decadeCounts) {
            if (count > 3) {
                return true;
            }
        }
        return false;
    }

    public static void writeCombinationsToFile(List<int[]> combinations, String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (int[] combination : combinations) {
                writer.println(Arrays.toString(combination));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not write to file: " + filename);
        }
    }
}
