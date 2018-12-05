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
public class Line {
    private 
            double endp1;
            double endp2;
            char lineType;
    
    public
            Line(){
                endp1 = endp2 = 0;
                lineType = ' ';
            }
            
//            Line(double first, double second, char third){
//                
//            }
            Line(Line obj){
                endp1 = obj.endp1;
                endp2 = obj.endp2;
                lineType = obj.lineType;
            }
            
            int line_compare(Line objLine){
                double l1 = this.calc_length();
                double l2 = objLine.calc_length();
                
                if(l1 > l2){
                    return 1;
                }
                else{
                    return 2;
                }
            }
            
            double calc_length(){
                return endp2 - endp1;
            }
            
            void set_endp1(double value)
            {
                endp1 = value;
            }
            
            void set_endp2(double value)
            {
                endp2 = value;
            }
            
            void set_lineType(char value)
            {
                lineType = value;
            }
            
            double get_endp1()
            {
                return endp1;
            }
            
            double get_endp2()
            {
                return endp2;
            }
            
            char get_LineType()
            {
                return lineType;
            }
            
            void disp(){
                System.out.println("endp1 = " + endp1);
                System.out.println("endp2 = " + endp2);
                System.out.println("lineType = " + lineType);
            }
}
