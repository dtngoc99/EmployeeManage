/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanage;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NGOC TY
 */
public class Manage {    
    Marketing ma=new Marketing();
    Accountants kt=new Accountants();
    
    public void employeeMarketing(int select){
        if(select==11){//official
            for(OfficialEmployee of:ma.officialList){
                System.out.println(of.toString());
            }
        }
        else if(select==12){//parttime
            for(ParttimeEmployee pt: ma.parttimeList){
                System.out.println(pt.toString());
            }
        }
    }
    public void employeeAccountants(int select){
        if(select==21){//official
            for(OfficialEmployee of:kt.officialList){
                System.out.println(of.toString());
            }
        }
        else if(select==22){//parttime
            for(ParttimeEmployee pt: kt.parttimeList){
                System.out.println(pt.toString());
            }
        }
    }
    public void addMarketingEmployee(int select){
        if(select==31){//official
            OfficialEmployee of=new OfficialEmployee();
            of.input();
            ma.officialList.add(of);
        }
        else if(select==32){//parttime
            ParttimeEmployee pt=new ParttimeEmployee();
            pt.input();
            ma.parttimeList.add(pt);
        }
    }
    public void addAccountantsEmployee(int select){
        if(select==41){//official
            OfficialEmployee of=new OfficialEmployee();
            of.input();
            kt.officialList.add(of);
        }
        else if(select==42){//parttime
            ParttimeEmployee pt=new ParttimeEmployee();
            pt.input();
            kt.parttimeList.add(pt);
        }    
    }
    public void deleteMarketingEmployee(int select){
        Scanner scan=new Scanner(System.in);
        int id;
        if(select==51){//official
            System.out.printf("ID: ");
            id=scan.nextInt();
            for(OfficialEmployee o:ma.officialList){
                if(id==o.getEmployeeID())
                {
                    ma.officialList.remove(o);
                    return;
                }
            }
        }
        else if(select==52){//parttime
            System.out.printf("ID: ");
            id=scan.nextInt();
            for(ParttimeEmployee pt:ma.parttimeList){
                if(id==pt.getEmployeeID())
                {
                    ma.parttimeList.remove(pt);
                    return;
                }
            }  
        }
        System.out.println("Not Exists");
    }
    public void deleteAccountantsEmployee(int select){
        Scanner scan=new Scanner(System.in);
        int id;        
        if(select==61){//official
            System.out.printf("ID: ");
            id=scan.nextInt();
            for(OfficialEmployee o:kt.officialList){
                if(id==o.getEmployeeID())
                {
                    kt.officialList.remove(o);
                    return;
                }
            }
        }
        else if(select==62){//parttime
            System.out.printf("ID: ");
            id=scan.nextInt();
            for(ParttimeEmployee pt:kt.parttimeList){
                if(id==pt.getEmployeeID())
                {
                    kt.parttimeList.remove(pt);
                    return;
                }
            }         
        }
        System.out.println("Not Exists");
    }
    public void updateMarketingE(int select){
        Scanner scan=new Scanner(System.in);
        System.out.printf("ID: ");
        int id=scan.nextInt();
        if(select==71){//official
            for(OfficialEmployee o:ma.officialList){
                if(id==o.getEmployeeID()){
                    System.out.printf("Salary: ");
                    o.setSalary(scan.nextFloat());
                    return;
                }
            }
        }
        else if(select==72){//parttime
            for(ParttimeEmployee pt:ma.parttimeList){
                if(id==pt.getEmployeeID()){
                    System.out.printf("Salary: ");
                    pt.setSalary(scan.nextFloat());
                    return;
                }
            }            
        }
        System.out.println("Not Exists");
    }
    public void updateAccountantsE(int select){
        Scanner scan=new Scanner(System.in);
        System.out.printf("ID: ");
        int id=scan.nextInt();
        if(select==81){//official
            for(OfficialEmployee o:kt.officialList){
                if(id==o.getEmployeeID()){
                    System.out.println("Salary: ");
                    o.setSalary(scan.nextFloat());
                    return;
                }
            }
        }
        else if(select==82){//parttime
            for(ParttimeEmployee pt:kt.parttimeList){
                if(id==pt.getEmployeeID()){
                    System.out.println("Salary: ");
                    pt.setSalary(scan.nextFloat());
                    return;
                }
            }            
        } 
        System.out.println("Not Exists");
    }
    public void menu(){
        ma.readFile(1);//đọc file danh sách nhân viên chính thức bộ phận maketing
        ma.readFile(2);//đọc file danh sách nhân viên thời vụ bộ phận maketing
        kt.readFile(1);//đọc file danh sách nhân viên chính thức bộ phận accountants
        kt.readFile(2);//đọc file danh sách nhân viên thời vụ bộ phận accountants
        Scanner scan=new Scanner(System.in);
        while(true){
            int select=0;
            System.out.println("\t0.Break");
            System.out.println("\t1.Marketing Employee List");
            System.out.println("\t2.Accountants Employee List");
            System.out.println("\t3.Add Marketing Employee");
            System.out.println("\t4.Add Accountants Employee");
            System.out.println("\t5.Delete Marketing Emloyee");
            System.out.println("\t6.Delete Accountants Emloyee");
            System.out.println("\t7.Update Salary Marketing Employee");
            System.out.println("\t8.Update Salary Accountants Employee");
            System.out.printf("Selection: ");
            select=scan.nextInt();
            switch(select){
                case 1:
                    System.out.println("\t\t11.OfficialEmployee");
                    System.out.println("\t\t12.ParttimeEmployee");
                    System.out.printf("\t\tSelection: ");
                    select=scan.nextInt();
                    employeeMarketing(select);
                    break;
                case 2:
                    System.out.println("\t\t21.OfficialEmployee");
                    System.out.println("\t\t22.ParttimeEmployee");
                    System.out.printf("\t\tSelection: ");
                    select=scan.nextInt();
                    employeeAccountants(select);                    
                    break;
                case 3:
                    System.out.println("\t\t31.OfficialEmployee");
                    System.out.println("\t\t32.ParttimeEmployee");
                    System.out.printf("\t\tSelection: ");
                    select=scan.nextInt();
                    addMarketingEmployee(select);
                    break;
                case 4:
                    System.out.println("\t\t41.OfficialEmployee");
                    System.out.println("\t\t42.ParttimeEmployee");
                    System.out.printf("\t\tSelection: ");
                    select=scan.nextInt();
                    addAccountantsEmployee(select);
                    break;
                case 5:
                    System.out.println("\t\t51.OfficialEmployee");
                    System.out.println("\t\t52.ParttimeEmployee");
                    System.out.printf("\t\tSelect: ");
                    select=scan.nextInt();
                    deleteMarketingEmployee(select);
                    break;
                case 6:
                    System.out.println("\t\t61.OfficialEmployee");
                    System.out.println("\t\t62.ParttimeEmployee");
                    System.out.printf("\t\tSelect: ");
                    select=scan.nextInt();
                    deleteAccountantsEmployee(select);
                    break;                    
                case 7:
                    System.out.println("\t\t71.OfficialEmployee");
                    System.out.println("\t\t72.ParttimeEmployee");
                    System.out.printf("\t\tSelect: ");
                    select=scan.nextInt();
                    updateMarketingE(select);
                    break;
                case 8:
                    System.out.println("\t\t81.OfficialEmployee");
                    System.out.println("\t\t82.ParttimeEmployee");
                    System.out.printf("\t\tSelect: ");
                    select=scan.nextInt();
                    updateAccountantsE(select);
                    break;
                default:
                    {
                        try {
                            ma.writeFile(1);//ghi file nhan viên official bộ phận marketing
                            ma.writeFile(2);//ghi file nhan viên parttime bộ phận marketing
                            kt.writeFile(1);//ghi file nhan viên official bộ phận accountants
                            kt.writeFile(2);//ghi file nhan viên parttime bộ phận accountants
                        } catch (IOException ex) {
                            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    return;
            }
        }
    }
}
