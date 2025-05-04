import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Write a command line program that will allow you to capture employee details[name, surname,
     * age,gender, position and salary].
     * The program should allow you to update details of a specific employee.
     * The program should allow you to print the details of a specific employee or print the full list of employees.
     * The program should have the capability to increase an employee's salary based on a percentage
     * The program should only terminate when the user types exit and press enter.
     */
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        String input = "";

        System.out.println("Employee details");
        System.out.println("Commands: add, update, print, list, increase, exit");


        while(!input.equals("exit")){
            System.out.print(">");
            input = inp.nextLine().trim().toLowerCase();

            switch (input) {
                case "add":
                    System.out.print("Enter name: ");
                    String name = inp.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = inp.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(inp.nextLine());
                    System.out.print("Enter gender: ");
                    String gender = inp.nextLine();
                    System.out.print("Enter position: ");
                    String position = inp.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = Double.parseDouble(inp.nextLine());

                    employees.add(new Employee(name, surname, age, gender, position, salary));
                    System.out.println("Employee added");
                    break;
                case "update":
                    System.out.println("Select employee to update (1 - " + employees.size()+")");
                    int index = Integer.parseInt(inp.nextLine()) - 1;
                    Employee employee = employees.get(index);

                    System.out.println("Enter new name (" + employee.getName()+")");
                    String newName = inp.nextLine();
                    if(!newName.isEmpty()){
                        employee.setName(newName);

                    }

                    System.out.println("Enter new surname (" + employee.getSurname()+")");
                    String newSurname = inp.nextLine();
                    if(!newSurname.isEmpty()){
                        employee.setSurname(newSurname);
                    }

                    System.out.println("Enter new age (" + employee.getAge()+")");
                    String newAge = inp.nextLine();
                    if(!newAge.isEmpty()){
                        employee.setAge(Integer.parseInt(newAge));
                    }

                    System.out.println("Enter new gender (" + employee.getGender()+")");
                    String newGender = inp.nextLine();
                    if(!newGender.isEmpty()){
                        employee.setGender(newGender);
                    }

                    System.out.println("Enter new position (" + employee.getPosition()+")");
                    String newPosition = inp.nextLine();
                    if(!newPosition.isEmpty()){
                        employee.setPosition(newPosition);
                    }

                    System.out.println("Enter new salary (" + employee.getSalary()+")");
                    String newSalary = inp.nextLine();
                    if(!newSalary.isEmpty()){
                        employee.setSalary(Double.parseDouble(newSalary));
                    }

                    System.out.println("Employee updated");
                    break;
                case "print":

                    System.out.println("Enter employee no: (1 - " + employees.size() + ")");
                    int getIndex = Integer.parseInt(inp.nextLine()) - 1;
                    System.out.println("\nEmployee ");
                    System.out.println(employees.get(getIndex));
                    break;
                case "list" :
                    System.out.println("\nEmployee List:");
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println("\nEmployee #" + (i + 1) + ":");
                        System.out.println(employees.get(i));
                    }
                    break;
                case "increase":
                    System.out.println("Enter employee no: (1 - " + employees.size() + ")");
                    int index2 = Integer.parseInt(inp.nextLine()) - 1;

                    System.out.println("Enter percentage increase");
                    double percentage = Double.parseDouble(inp.nextLine());

                    employees.get(index2).increaseSalary(percentage);
                    System.out.println("Employee salary to R " + employees.get(index2).getSalary());
                    break;
                case "exit":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        // close scanner
        inp.close();
    }
}