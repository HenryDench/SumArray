/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarray;
import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What dimensions do you want the array to be(EX: 1 1):");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int stop = x * y;
        int xx = 0, yy = 0;
        double next = 0;
        double Array[][] = new double[x][y];
        double row[] = new double[x];
        double sum = 0, avg = 0;
        
        for(int i = 0; i < stop; i++) 
        {
            xx = i / y;
            yy = i % y;
            Array[xx][yy] = 0;
            
        }
        System.out.println("Now fill the area by typing in the numbers you want until full or type STOP when done: ");
        for(int i = 0; i < stop; i++) 
        {
            String input = a.next();
            if(input.equalsIgnoreCase("stop")) break;
            else next = Double.parseDouble(input);
            xx = i / y;
            yy = i % y;
            Array[xx][yy] = next;
            if(i == stop) break;
        }
        
        for(int i = 0; i < x; i ++)
        {
            for(int j = 0; j < y; j ++)
            {
                row[i] += Array[i][j];
            }
            System.out.println("Row " + (i + 1) + " = " + row[i]);
            sum += row[i];
        }
        System.out.println("Sum = " + sum);
        avg = sum / stop;
        System.out.println("Average = " + avg);
        
           
    }
    
}
