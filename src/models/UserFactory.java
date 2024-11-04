package models;
// Used Factory Method for creating Models: User, Course, Module ...
public class UserFactory {
    public static User createUser(String userType, String name){
        switch (userType.toLowerCase()){
            case "student" : return new Student(name);
            case "teacher" : return new Teacher(name);
            case "admin" : return new Admin(name);
            default: throw new IllegalArgumentException("Unknown user type!!!");
        }
    }
}
