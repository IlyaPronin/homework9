package lesson_9;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String surName;

    public Author(String firstName,String surName){
        this.firstName = firstName;
        this.surName = surName;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurName(){
        return surName;
    }

    @Override
    public String toString() {
        return  firstName + " " + surName + " " ;
    }
    @Override
    public boolean equals (Object Author){
        if (this.getClass() != this.getClass()) {
           return false;

        }
        Author Author2 = (Author) Author;
        return toString().equals(Author2.toString());


    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName);
    }
}

