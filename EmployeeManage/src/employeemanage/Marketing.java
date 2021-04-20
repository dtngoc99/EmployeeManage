/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanage;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NGOC TY
 */
public class Marketing extends Department{

    private final static String linkPt="E:\\Marketing\\Parttime.txt";
    private final static String linkOf="E:\\Marketing\\Official.txt";

    public void readFile(int select){
        if(select==1){//official
            try {
                try (Scanner scan = new Scanner(Paths.get(linkOf),"UTF-8")) {
                    while(scan.hasNextLine()){
                        OfficialEmployee of=new OfficialEmployee();
                        of.setEmployeeID(scan.nextInt());
                        of.setSalary(scan.nextFloat());
                        String s=scan.nextLine().trim();
                        StringTokenizer token=new StringTokenizer(s,",");
                        of.setEmployeeName(token.nextToken());
                        of.setGender(token.nextToken());
                        of.setBirthday(token.nextToken());
                        of.setAddress(token.nextToken());
                        of.setPhoneNumber(token.nextToken());
                        of.setDateOfSigningContract(token.nextToken());
                        of.setPosition(token.nextToken());
                        super.officialList.add(of);
                        
                    }
                }
                
            } catch (IOException ex) {
                System.out.println("Error 1 readFile maketing");
                Logger.getLogger(Accountants.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(select==2){//parttime
            try {
                try (Scanner scan = new Scanner(Paths.get(linkPt),"UTF-8")) {
                    while(scan.hasNextLine()){
                        ParttimeEmployee pt=new ParttimeEmployee();
                        pt.setEmployeeID(scan.nextInt());
                        pt.setSalary(scan.nextFloat());
                        String s=scan.nextLine().trim();
                        StringTokenizer token=new StringTokenizer(s,",");
                        pt.setEmployeeName(token.nextToken());
                        pt.setGender(token.nextToken());
                        pt.setBirthday(token.nextToken());
                        pt.setAddress(token.nextToken());
                        pt.setPhoneNumber(token.nextToken());
                        pt.setDateBegin(token.nextToken());
                        pt.setPosition(token.nextToken());
                        super.parttimeList.add(pt);
                        
                    }
                }
                
            } catch (IOException ex) {
                System.out.println("Error 2 readFile marketing");
                Logger.getLogger(Accountants.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    public void writeFile(int select) throws IOException{
        if(select==1){//official
            try {
                FileOutputStream fos=new FileOutputStream(linkOf);
                OutputStreamWriter osw=new OutputStreamWriter(fos);
                BufferedWriter bw=new BufferedWriter(osw);
                for(OfficialEmployee of: super.officialList){
                    bw.write(of.getEmployeeID()+" ");
                    bw.write(of.getSalary()+" ");
                    bw.write(of.getEmployeeName()+",");
                    bw.write(of.getGender()+",");
                    bw.write(of.getBirthday()+",");
                    bw.write(of.getAddress()+",");
                    bw.write(of.getPhoneNumber()+",");             
                    bw.write(of.getDateOfSigningContract()+",");
                    bw.write(of.getPosition()+"\n");
                }
                bw.close();
                osw.close();
                fos.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Error 1 writeFile");
                Logger.getLogger(Accountants.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(select==2){
            try {
                FileOutputStream fos=new FileOutputStream(linkPt);
                OutputStreamWriter osw=new OutputStreamWriter(fos);
                BufferedWriter bw=new BufferedWriter(osw);
                for(ParttimeEmployee pt: super.parttimeList){
                    bw.write(pt.getEmployeeID()+" ");
                    bw.write(pt.getSalary()+" ");
                    bw.write(pt.getEmployeeName()+",");
                    bw.write(pt.getGender()+",");
                    bw.write(pt.getBirthday()+",");
                    bw.write(pt.getAddress()+",");
                    bw.write(pt.getPhoneNumber()+",");   
                    bw.write(pt.getDateBegin()+",");
                    bw.write(pt.getPosition()+"\n");
                }
                bw.close();
                osw.close();
                fos.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Error 2 writeFile");
                Logger.getLogger(Accountants.class.getName()).log(Level.SEVERE, null, ex);
            }        
        }
    }

}
