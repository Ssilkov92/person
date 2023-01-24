package org.example;
//first
package Menu;

public class Person {

    //Атрибуты класса
    private String name = "";
    private String surname = "";
    private String year = "";

    private final int ALLFIELDS = 3;

    //Конструктор
    public Person() {
    }

    //Методы
    public String printInfo() {
        String printout = "";

        for (int i = 0; i < ALLFIELDS; i++) {
            printout = String.format("Name: %s \nSurname: %s \nYear: %s \n", name, surname, year);
        }
        return printout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
