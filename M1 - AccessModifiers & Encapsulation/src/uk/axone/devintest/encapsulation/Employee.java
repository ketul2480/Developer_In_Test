package uk.axone.devintest.encapsulation;

public class Employee {

    private String empID;
    private String empName;
    private int empAge;
    private int Salary;
    private int holidays;



    public Employee(){

    }

    public Employee(String empID){
        this.empID = empID;
        loadDetails();
    }

    public void save(){
        //Validate data for each and every variable
        //insert a row into the Employee Table
        //insert into Employee values(empID,empName, Age, Salary, Holidays
    }
    private void loadDetails(){
        //fetch the employee details for a given empID from the employee table
        //select* from Employee where EMPLOYEE_ID = empID
        //empName = ..
        //empAge = ...
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        //Do Validation
        //throw an execption if data is invalid
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        //Do Validation
        //throw an execption if data is invalid
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        //Do Validation
        //throw an execption if data is invalid
        this.empAge = empAge;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        //Do Validation
        //throw an execption if data is invalid
        Salary = salary;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        //Do Validation
        //throw an execption if data is invalid
        this.holidays = holidays;
    }
}
