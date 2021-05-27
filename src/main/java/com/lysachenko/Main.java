package com.lysachenko;

import com.lysachenko.comparator.ComparatorByLengthNameOfEmblem;
import com.lysachenko.comparator.ComparatorByTitleReverse;
import com.lysachenko.model.Family;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String str = "1,2,3,4,4,44,  5     ,5,6,7    ,8,9,0, 0 ,0";
        replaceDuplicateInString(str);

        Map<Integer, Family> familyMap = new TreeMap<>();
        familyMap.put(1, new Family("Ivanovy", 44, "Kings", "1Goweroo!!!"));
        familyMap.put(2, new Family("Dmitrovy", 22, "Boyars", "6ooo!!!"));
        familyMap.put(3, new Family("Borschovy", 31, "Marquises", "3G!"));
        familyMap.put(4, new Family("Lysachenky", 64, "Barons", "4Gooo!!!"));
        familyMap.put(5, new Family("Snezhynski", 28, "Princes", "2Go234322oo!!!"));
        familyMap.put(6, new Family("Marchenky", 35, "Dukes", "5Gooowerrrr!!!"));
        familyMap.put(7, new Family("Kalinichenki", 17, "Viscounts", "9q"));
        familyMap.put(8, new Family("Starchenky", 34, "Counts", "6Gooo!"));
        familyMap.put(9, new Family("Nagorni", 43, "Boyars", "234Gjymnhtbgrfewreooo!!!"));
        familyMap.put(10, new Family("Svetlyi", 15, "Marquises", "654Gowtegfoo!!!"));

        System.out.println("\n\nSource map:");
        familyMap.forEach((integer, family) -> System.out.println(integer + " : " + family));

        System.out.println("\nSort by name:");
        sortAndShowMap(familyMap, Map.Entry.comparingByValue());

        System.out.println("\nSort by title in reverse order:");
        sortAndShowMap(familyMap, new ComparatorByTitleReverse());

        System.out.println("\nSort by length of emblem name:");
        sortAndShowMap(familyMap, new ComparatorByLengthNameOfEmblem());
    }

    private static void replaceDuplicateInString(String str) {
        System.out.println("Source string: " + str);
        System.out.print("Result string: ");

        Arrays.stream(
                str
                        .replaceAll(" ", "")
                        .split(",")
        )
                .collect(Collectors.toSet())
                .forEach(e -> System.out.print(e + " "));
    }

    private static void sortAndShowMap(
            Map<Integer, Family> familyMap,
            Comparator<Map.Entry<Integer, Family>> comparator
    ) {
        familyMap.entrySet().stream()
                .sorted(comparator)
                .forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));
    }
}
