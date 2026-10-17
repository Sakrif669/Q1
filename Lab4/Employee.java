
public class Employee {

    private String fname;
    private String lname;
    private Address address;

    private static int nextStaffNumber = 1000;
    private int employeeNumber;

    private String empType;
    private String comCarType;

    public Employee(String fname, String lname, Address address, String empType) {
        setEmployeeNumber(nextStaffNumber);
        setFname(fname);
        setLname(lname);
        setAddress(address);
        setEmpType(empType);

        nextStaffNumber++;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getComCarType() {
        return comCarType;
    }

    public void setComCarType(String comCarType) {
        this.comCarType = comCarType;
    }

    public int noOfEmployee() {
        return nextStaffNumber - 1000;
    }

    @Override
    public String toString() {
        if (empType != null && empType.equalsIgnoreCase("Manager")) {
            return "Employee [fname=" + fname
                    + ", lname=" + lname
                    + ", address=" + address
                    + ", employeeNumber=" + employeeNumber
                    + ", empType=" + empType
                    + ", comCarType=" + comCarType + "]";
        } else {
            return "Employee [fname=" + fname
                    + ", lname=" + lname
                    + ", address=" + address
                    + ", employeeNumber=" + employeeNumber
                    + ", empType=" + empType + "]";
        }
    }
}
