package models;

public abstract class User {
    String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
