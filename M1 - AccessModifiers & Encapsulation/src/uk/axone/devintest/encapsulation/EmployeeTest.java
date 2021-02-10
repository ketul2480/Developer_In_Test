package uk.axone.devintest.encapsulation;

public class EmployeeTest {

    public void testEmployeeClass() {


        //scenario -1 - Create new Employee
        Employee newEmp = new Employee();
        //newEmp.empID = "123";//this will be the value from the UI entered by the user
        /*newEmp.empName = "tom";
        newEmp.empAge = 23;
        newEmp.holidays = 28;
        newEmp.Salary = 38000;
        newEmp.save();*/
        newEmp.setEmpID("ID123");
        newEmp.setEmpName("ketul");
        newEmp.save();


       // scenario -2 - get Employee details given an employee ID
        Employee emp = new Employee("123");//this will be the value from the UI
        //String name = emp.empName;
       // int age = emp.empAge;
        String name = emp.getEmpName();
        String ID = emp.getEmpID();
    }

}
