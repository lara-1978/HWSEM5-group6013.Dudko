package model;

public abstract class User {  //тут работаем с ФИО
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {  // сделаем конструктор
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    // создадим геттеры и сеттеры
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName + "]";
    }

    
    
}

