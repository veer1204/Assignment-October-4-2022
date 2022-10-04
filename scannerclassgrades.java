/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author veerc
 */
import java.util.Scanner;

public class scannerclassgrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input1 = new Scanner(System.in);
        System.out.print("Write your grade");
        int grade = input1.nextInt();
        
        if(grade>=80)
        {
            System.out.println("More than 80%");
        
        }
        else if(grade>=60){
            System.out.println("More than 60%");
        }
        else if(grade>=40){
            System.out.println("More than 40%, You're Average");  
            
        }    
        else{
            System.out.println("Your grade was not 80&, 60%, or 40% so you Failed");
        }    
        
        
        
    }
}
