package lesson_9;

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
}
