/**
 Stworzyć klasę Person, która będzie miała pola:
 private String name;
 private String surname;
 private int age;
 private float height;
 private String comment;
 oraz konstruktor ustawiający wartości pól oraz gettery i settery.
 Stworzyć listę z elementami typu Person.

 1. Za pomocą metody findFirst z klasy Stream, wybierz osobę, która ma na imię i nazwisko "Adam Nowak".
 */
public class Person {
    private String name;
    private String surname;
    private int agel;
    private float height;
    private String comment;

    public Person(String name, String surname, int agel, float height, String comment) {
        this.name = name;
        this.surname = surname;
        this.agel = agel;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAgel() {
        return agel;
    }

    public void setAgel(int agel) {
        this.agel = agel;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", agel=" + agel +
                ", height=" + height +
                ", comment='" + comment + '\'' +
                '}';
    }
}
