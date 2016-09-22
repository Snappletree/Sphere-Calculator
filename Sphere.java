
/**
 * Write a description of class Sphere here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;



public class Sphere
{
    public static void main (String arg[])
    {
        Scanner reader = new Scanner(System.in);
        
        int Rad;
        int radius;
        int SurfaceArea;
        double Volume;
        double SurfArea;
        double answerpi;
        int square;
        int cube;
        double fraction;
        
       
        System.out.println("Please type in the radius of the sphere");
        
        Rad = reader.nextInt();
        
        radius = (Rad * 2); 
        System.out.println("The diameter or the Sphere is " + radius );
        
        
        
        answerpi = (2 * Math.PI * Rad);
        System.out.println("The circumference of the Sphere is " + answerpi);
        
        square = (Rad * Rad);
        SurfArea = (square * 4 * Math.PI);
        System.out.println("The surface area of the Sphere is " + SurfArea); 
        
       cube = (Rad * Rad * Rad);
       fraction = (4.0/3.0);
       Volume = (cube * fraction * Math.PI);
       System.out.println ("The volume of the Sphere is " + Volume);
       
       
     
       
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
