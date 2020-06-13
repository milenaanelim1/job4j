package ru.job4j.tracker;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(String name) {
        this.name = name;
        return name;
    }

    public String getSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    public String getEducation(String edu) {
        this.education = edu;
        return edu;
    }

    public String getBday(String bday) {
        this.birthday = bday;
        return bday;
    }
}
