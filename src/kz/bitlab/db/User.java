package kz.bitlab.db;

public class User {
    private String name;
    private String surname;
    private String club;
    private String salary;
    private String transferPrice;

    public User() {
    }

    public User(String name, String surname, String club, String salary, String transferPrice) {
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.salary = salary;
        this.transferPrice = transferPrice;
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(String transferPrice) {
        this.transferPrice = transferPrice;
    }
}
