package br.com.bianeck.stream.reduce.exemplo1;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class User {

    private String name;
    private LocalDate dateOfBirth;

    public User(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        return dateOfBirth.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
