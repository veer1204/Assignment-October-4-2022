/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author veerc
 */
import java.util.Scanner;

public class Scannertextradius {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input1 = new Scanner(System.in);
        System.out.println("Write your radius");
        int radius = input1.nextInt();
        double area = radius*3.14;
        
        if(radius>0)
        {
            System.out.print(area);
            System.out.println("Area is computed and displayed");
        
        }
        else{
            System.out.println("Negative Input");
        }
    }
}
