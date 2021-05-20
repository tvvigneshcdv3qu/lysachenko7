package com.lysachenko.comparator;

import com.lysachenko.model.Family;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ComparatorByTitleReverse implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {

        if (Objects.equals(family1.getValue().getTitle(), family2.getValue().getTitle())) {
            return 0;
        }
        if (family1.getValue().getTitle().equals(family2.getValue().getTitle())) {
            return 0;
        }
        if (family1.getValue().getTitle() == null) {
            return -1;
        }
        if (family2.getValue().getTitle() == null) {
            return 1;
        }

        return family1.getValue().getTitle().compareTo(family2.getValue().getTitle()) * -1;
    }
}
