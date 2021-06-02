package com.lysachenko.comparator;

import com.lysachenko.model.Family;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class ComparatorByLengthNameOfEmblem implements Comparator<Map.Entry<Integer, Family>> {

    @Override
    public int compare(Map.Entry<Integer, Family> family1, Map.Entry<Integer, Family> family2) {

        String familyEmblemName1 = family1.getValue().getNameOfEmblem();
        String familyEmblemName2 = family2.getValue().getNameOfEmblem();

        if (Objects.equals(familyEmblemName1, familyEmblemName2)) {
            return 0;
        }

        return Integer.compare(familyEmblemName1.length(), familyEmblemName2.length());
    }
}
