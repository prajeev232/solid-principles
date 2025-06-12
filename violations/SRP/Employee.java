// SRP: A class must have only one and one reason to change.
// In this case, there are three reasons it might cause change:
// 1. Change in employee attributes
// 2. Change in the way the employee is saved to the database.
// 3. Change in the way tax is calculated.

public class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeType;

    public void save() {
        // seralize object into string
        // Establish connection to database and save. Use try/catch blocks
    }

    public void calculateTax() {
        if (this.getEmployeeType().equals("full-time")) {
            // Calculate tax for full time employee
        }

        if (this.getEmployeeType().equals("contact")) {
            // Calculate tax for contractors
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}