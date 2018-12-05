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
public class Faculty extends Person{
    private 
            int years_of_service;
            String course_taught;
    
    public
            Faculty(){}
            Faculty(int years_of_service, String course_taught, String name, int age) {
                super(name, age);
                this.years_of_service = years_of_service;
                this.course_taught = course_taught;
            }
        
            void set_service(int service){
                years_of_service = service;
            }
            
            void set_course_taught(String course){
                course_taught= course;
            }
            
            void disp(){
                super.disp();
                System.out.println("Service: " + years_of_service);
                System.out.println("Course taught: " + course_taught);
                System.out.println();
            }
}
