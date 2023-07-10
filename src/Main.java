/*
You are asked to create a payroll system for a company.
The company has two types of employees: SalariedEmployee and HourlyEmployee.
 The calculatePay() method is common for both the types
The SalariedEmployee object has the following attributes:
name (string)
salary (double)
The HourlyEmployee object has the following attributes:
name (string)
hourlyRate (double)
hoursWorked (double)
The calculatePay() method for SalariedEmployee should calculate the monthly salary,
 while the calculatePay() method for HourlyEmployee
 should calculate the weekly pay based on the hourly rate and hours worked.
 Write a java code snippet to demonstrate the usage of these classes.c
 */
class Empolyee{
    void calculate(String name,double salary){
        System.out.println(name+" "+salary);
    }
    void calcualte(String name,double hourlyrate,double hourlyworked){
        System.out.println(name+" "+hourlyrate*hourlyworked);
    }

}

class Main{
    public static void main(String[] args) {
        Empolyee empolyee=new Empolyee();
        empolyee.calculate("praveenraj",100000l);
        empolyee.calcualte("praveenraj",3000l,8l);

    }
}