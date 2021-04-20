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
public class OfficialEmployee extends Employee{
    private String dateOfSigningContract;

    public String getDateOfSigningContract() {
        return dateOfSigningContract;
    }

    public void setDateOfSigningContract(String dateOfSigningContract) {
        this.dateOfSigningContract = dateOfSigningContract;
    }
    @Override
    public void input(){
        super.input();
        Scanner scan=new Scanner(System.in);
        System.out.printf("DateOfSigningContract: ");
        this.dateOfSigningContract=scan.nextLine();
    }

    @Override
    public String toString() {
        return "OfficialEmployee{" +super.toString()+ " dateOfSigningContract=" + dateOfSigningContract + '}';
    }
    
}
