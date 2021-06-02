package com.lysachenko.comparator;

import com.lysachenko.model.Family;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ComparatorByTitleReverse implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {

        String familyTitle1 = family1.getValue().getTitle();
        String familyTitle2 = family2.getValue().getTitle();

        if (Objects.equals(familyTitle1, familyTitle2)) {
            return 0;
        }
        if (familyTitle1.equals(familyTitle2)) {
            return 0;
        }

        return family1.getValue().getTitle().compareTo(family2.getValue().getTitle()) * -1;
    }
}
