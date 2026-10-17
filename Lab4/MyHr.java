
import java.util.Scanner;

public class MyHr {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        Employee[] emps = new Employee[5];
        Office[] offices = new Office[3];

        for (int y = 0; y < offices.length; y++) {
            offices[y] = new Office();
        }

        while (choice != 4) {

            System.out.println("\nPlease select one of the following options:");
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");

            choice = in.nextInt();
            in.nextLine();

            if (choice == 1) {

                for (Office of : offices) {
                    System.out.println(
                        of + "\tNo. of employees: " + of.getNoOfEmps()
                    );

                    if (of.getNoOfEmps() != 0) {
                        System.out.println(
                            "Employees:\n" + of.printEmployee()
                        );
                    }
                }

            } else if (choice == 2) {

                if (Employee.noOfEmployee < emps.length) {

                    String fname;
                    String lname;
                    String street;
                    String city;
                    String county;
                    String empType;
                    String comCarType = null;

                    System.out.println("Please enter employee firstname:");
                    fname = in.nextLine();

                    System.out.println("Please enter employee surname:");
                    lname = in.nextLine();

                    System.out.println("Please enter street:");
                    street = in.nextLine();

                    System.out.println("Please enter town/city:");
                    city = in.nextLine();

                    System.out.println("Please enter county:");
                    county = in.nextLine();

                    System.out.println(
                        "Please enter employee type (Manager | Staff):"
                    );
                    empType = in.nextLine();

                    if (empType.equalsIgnoreCase("Manager")) {
                        System.out.println(
                            "Please enter company car type:"
                        );
                        comCarType = in.nextLine();
                    }

                    // Создание адреса и сотрудника
                    Address add = new Address(street, city, county);

                    Employee emp = new Employee(
                        fname, lname, add, empType
                    );

                    emp.setComCarType(comCarType);

                    emps[Employee.noOfEmployee] = emp;

                    boolean added = false;

                    for (Office of : offices) {
                        if (of.getNoOfEmps() < 2) {
                            of.addEmployee(emp);
                            added = true;
                            break;
                        }
                    }

                    if (added) {
                        System.out.println(
                            "Employee created successfully."
                        );
                    } else {
                        System.out.println(
                            "No office has space for another employee."
                        );
                    }

                } else {
                    System.out.println(
                        "You have created the maximum number of employees."
                    );
                }

            } else if (choice == 3) {

                for (Employee emp : emps) {
                    if (emp != null) {
                        System.out.println(emp);
                    }
                }

            } else if (choice == 4) {

                System.out.println("Goodbye!!");

            } else {
                System.out.println(
                    "Invalid option. Please select 1, 2, 3 or 4."
                );
            }
        }

        in.close();
    }
}
