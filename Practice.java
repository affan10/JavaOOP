/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author Affan
 */
public class Practice{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        Scanner reader = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con = DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/test","root","root");  
        //here sonoo is database name, root is username and password  
        Statement stmt = con.createStatement();
//        List<Student> students_list = new ArrayList<>();
//        List<Faculty> faculty_list = new ArrayList<>();
           
        char opt = 'a';
        
        do{
            
            System.out.println("Campus Management System!\n"
                + "1 for enrolling a new student:\n"
                + "2 for appointing a new faculty member:\n"
                + "3 for displaying all student data:\n"
                + "4 for displaying all faculty members:\n"
                    + "5 for removing a particular student from database:\n"
                    + "6 for removing a particular faculty member from database:\n"
                    + "7 for updating record of a student:\n"
                    + "8 for updating record of a faculty member: ");
        
            int user_in = reader.nextInt();
            reader.nextLine();

                switch(user_in){
                    case 1:
                        System.out.println("Enter following details:\nEnter first name:");
                        String first_name = reader.nextLine();
                        System.out.println("Enter last name:");
                        String last_name = reader.nextLine();
                        //System.out.println(name);
                        System.out.println("Enter age:");
                        int age = reader.nextInt();
                        reader.nextLine();
                        System.out.println("Enter degree:");
                        String degree = reader.nextLine();
                        System.out.println(degree);
                        System.out.println("Enter enrollment year:");
                        int year = reader.nextInt();
                        reader.nextLine();

                        //Student student_obj = new Student(degree, year, name, age);
                        //students_list.add(student_obj);
                        
                        //stmt.executeUpdate("INSERT INTO student (first_name, last_name, age, degree, enrollment_year) VALUES (?,?,?,?,?)");  
                        PreparedStatement pstmt = con.prepareStatement("INSERT INTO student (first_name, last_name, age, degree, enrollment_year)"
                                + " VALUES (?,?,?,?,?)");
                        
                        pstmt.setString(1, first_name);
                        pstmt.setString(2, last_name);
                        pstmt.setInt(3, age);
                        pstmt.setString(4, degree);
                        pstmt.setInt(5, year);
                        pstmt.executeUpdate();
                        con.close();
                        
                        System.out.println("Student successfully enrolled!\n"
                                + "Press q to quit or any other to return to main menu: ");
                        opt = reader.next(".").charAt(0);
                        System.out.println();
                        break;
                        
                    case 2:
                        System.out.println("Enter following details:\n"
                                + "Enter first name:");
                        String fname = reader.nextLine();
                        System.out.println("Enter second name:");
                        String sec_name = reader.nextLine();
                        System.out.println("Enter age:");
                        int fage = reader.nextInt();
                        reader.nextLine();
                        System.out.println("Enter years of service:");
                        int years = reader.nextInt();
                        reader.nextLine();
                        System.out.println("Enter course taught:");
                        String course = reader.nextLine();
                        
                        PreparedStatement fpstmt = con.prepareStatement("INSERT INTO faculty (first_name, last_name, age, course, service_years)"
                                + " VALUES (?,?,?,?,?)");
                        
                        fpstmt.setString(1, fname);
                        fpstmt.setString(2, sec_name);
                        fpstmt.setInt(3, fage);
                        fpstmt.setString(4, course);
                        fpstmt.setInt(5, years);
                        fpstmt.executeUpdate();
                        con.close();
                        
                        //Faculty faculty_obj = new Faculty(years, course, fname, fage);
                        //faculty_list.add(faculty_obj);
                        System.out.println("Faculty successfully added!\n"
                                + "Press q to quit or any other to return to main menu: ");
                        opt = reader.next(".").charAt(0);
                        System.out.println();
                        break;
                    
                    case 3:
//                        for(Iterator<Student> iter = students_list.iterator(); iter.hasNext();){
//                            iter.next().disp();
//                        }
                        break;
                    case 4:
//                        for(Iterator<Faculty> iter = faculty_list.iterator(); iter.hasNext();){
//                            iter.next().disp();
//                        }
                        break;
                }
            } while (opt != 'q');
    }
}