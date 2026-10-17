public class Office {
    
    private static int nextOffice = 100;
    private int officeNumber;
    private int noOfEmps = 0;
    private Employee[] employees = new Employee[2];
    
    public Office() {
        setOfficeNumber(nextOffice);
        nextOffice++;
    }
    
    public int getOfficeNumber() {
        return officeNumber;
    }
    
    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
    
    public int getNoOfEmps() {
        return noOfEmps;
    }
    
    public void setNoOfEmps(int noOfEmps) {
        this.noOfEmps = noOfEmps;
    }
    
    public Employee[] getEmployees() {
        return employees;
    }
    
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        if(noOfEmps <= 2){
            employees[noOfEmps]=employee;
            noOfEmps++;
        }
        else{
            System.out.println("You have reached the maximum no. of employees!");
        }
    }

    public String printEmployee(){
        String empDetails="";
        for(Employee emp:employees){
            if(emp !=null){
                empDetails+=emp.getEmployeeNumber() + "," + emp.getFname() + "," + emp.getLname() + "\n";
            }
        }
        return empDetails;
    }
    @Override
    public String toString() {
        return "Office [officeNumber=" + officeNumber + "]";
    }
}