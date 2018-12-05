/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Affan
 */
public class Student extends Person{
    private 
            String degree;
            int enrollment_year;
            
    public
            Student(){}
            Student(String degree, int enrollment, String name, int age){
                super(name, age);
                this.degree = degree;
                this.enrollment_year = enrollment;
            }
            
            void set_degree(String degree){
                this.degree = degree;
            }
            
            void set_enrollment_year(int year){
                this.enrollment_year = year;
            }
            
            void disp(){
                super.disp();
                System.out.println("Degree: " + degree);
                System.out.println("Enrollment Year: " + enrollment_year);
                System.out.println();
            }
}
