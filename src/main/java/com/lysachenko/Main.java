package com.lysachenko;

import com.lysachenko.comparator.ComparatorByLengthNameOfEmblem;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String str = "1,2,3,4,54,5,6,7,8,9,0";

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

        System.out.println("Sort by name:");
        sortAndShowMap(familyMap, new ComparatorByLengthNameOfEmblem());

        /*List<Map.Entry<Integer, Family>> familyList = sortByFamilyName(familyMap);
        familyList.forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));

        System.out.println("\nSort by name of emblem:");
        familyList.sort(new ComparatorByLengthNameOfEmblem());
        familyList.forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));

        System.out.println("\nSort by title:");
        familyList.sort(new ComparatorByTitle());
        familyList.forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));*/

    }

    private static void sortAndShowMap(Map<Integer, Family> familyMap, Comparator<Map.Entry<Integer, Family>> comparator) {
        familyMap.entrySet().stream()
                .sorted(comparator)
                .forEach(familyEntry -> System.out.println(familyEntry.getKey() + " : " + familyEntry.getValue()));
    }

    /*public static List<Map.Entry<Integer, Family>> sortByFamilyName(Map<Integer, Family> familyMap) {
        List<Map.Entry<Integer, Family>> familyList = new ArrayList<>(familyMap.entrySet());
        familyList.sort(Map.Entry.comparingByValue());
        familyList.forEach(familyEntry -> {
            familyMap.put(familyEntry.getKey(), familyEntry.getValue());
        });
        return familyList;
    }*/
}
