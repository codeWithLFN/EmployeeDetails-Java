public class Employee {

    private String name;
    private String surname;
    private int age;
    private String gender;
    private String position;
    private double salary;

    //Constructor
    public Employee(String name, String surname, int age, String gender, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }

    // getters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to increase salary by a percentage
    public void increaseSalary(double percentage){
        this.salary += this.salary * percentage / 100;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name +
                "\nSurname: " + surname +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nPosition: " + position +
                "\nSalary: R" + salary;
    }

}
