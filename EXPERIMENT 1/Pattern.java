/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;
import java.util.Scanner;

/**
 *
 * @author 91984
 */
public class expt1e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n=obj.nextInt();       
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.println(" ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.println("*");
            }
            System.out.println();
            }
        // TODO code application logic here
    }
    
}
