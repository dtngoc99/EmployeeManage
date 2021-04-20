/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanage;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Employee {
    private int employeeID;
    private String employeeName;
    private String address;
    private String phoneNumber;
    private String gender;
    private String birthday;
    private float salary;
    private String position;
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public float getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.printf("EmployeeID: ");
        employeeID=scan.nextInt();
        System.out.printf("EmployeeName: ");
        scan.nextLine();
        employeeName=scan.nextLine();
        System.out.printf("Address: ");
        address=scan.nextLine();
        System.out.printf("PhoneNumber: ");
        phoneNumber=scan.nextLine();
        System.out.printf("Gender: ");
        gender=scan.nextLine();
        System.out.printf("Birthday: ");
        birthday=scan.nextLine();
        System.out.printf("Salary: ");
        salary=scan.nextFloat();
        scan.nextLine();
        System.out.printf("Position: ");
        position=scan.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID= " + employeeID + ", employeeName= " + employeeName + ", address= " + address + ", phoneNumber= " + phoneNumber + ", gender= " + gender + ", birthday= " + birthday + ", salary= " + salary + ", position= "+position+'}';
    }
    
}
