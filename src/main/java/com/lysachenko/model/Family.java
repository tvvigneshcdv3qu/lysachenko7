package com.lysachenko.model;

public class Family implements Comparable<Family> {

    private String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public void setNameOfEmblem(String nameOfEmblem) {
        this.nameOfEmblem = nameOfEmblem;
    }

    @Override
    public int compareTo(Family family) {
        return getName().compareTo(family.getName());
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", quantityMember=" + quantityMember +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                '}';
    }
}
