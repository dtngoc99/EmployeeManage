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
public class ParttimeEmployee extends Employee {
    private String dateBegin;

    public String getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(String dateBegin) {
        this.dateBegin = dateBegin;
    }

    @Override
    public void input(){
        super.input();
        Scanner scan=new Scanner(System.in);
        System.out.printf("DateBegin: ");
        this.dateBegin=scan.nextLine();
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +super.toString()+ " dateBegin=" + dateBegin + '}';
    }
    
}
