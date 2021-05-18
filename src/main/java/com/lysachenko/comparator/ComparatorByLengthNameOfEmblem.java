package com.lysachenko.comparator;

import com.lysachenko.Family;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ComparatorByLengthNameOfEmblem implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {

        if (Objects.equals(family1.getValue().getNameOfEmblem(), family2.getValue().getNameOfEmblem())) {
            return 0;
        }
        if (family1.getValue().getNameOfEmblem() == null) {
            return -1;
        }
        if (family2.getValue().getNameOfEmblem() == null) {
            return 1;
        }
        if (family1.getValue().getNameOfEmblem().length() > family2.getValue().getNameOfEmblem().length()) {
            return 1;
        }
        if (family1.getValue().getNameOfEmblem().length() < family2.getValue().getNameOfEmblem().length()) {
            return -1;
        }
        if (family1.getValue().getNameOfEmblem().length() == family2.getValue().getNameOfEmblem().length()) {
            return 0;
        }

        return 0;
    }
}
