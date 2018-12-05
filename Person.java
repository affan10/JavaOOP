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
public class Person {
    private
        String first_name;
        String last_name;
        int age;
    
    public 
            Person(){}
            Person(String first_name, int age){
                this.first_name = first_name;
                this.age = age;
            }
            
            void set_first_name(String first_name, String last_name){
                this.first_name = first_name;
                this.last_name = last_name;
            }
            
            void set_age(int age){
                this.age = age;
            }
            
            void disp(){
                System.out.println("First name: " + first_name);
                System.out.println("Last name: " + last_name);
                System.out.println("Age: " + age);
            }
}
