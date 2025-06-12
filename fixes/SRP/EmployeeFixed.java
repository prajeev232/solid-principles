package SRP;

public class EmployeeFixed {
    private String employeeId;
    private String employeeName;
    private String employeeAddress;
    private String employeeType;

    public void save() {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(this);
    }

    public void calculateTax() {
        new TaxCalculator().calculateTax(this);
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