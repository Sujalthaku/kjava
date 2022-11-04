import java.util.Scanner;
/**
 * Write a description of class Choice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Choice 
{
    public static void choice1(){
    
        System.out.println("Enter grade below");
        Scanner S = new Scanner(System.in);
        int takeInput = S.nextInt();
        
        
        
        System.out.println("method choice 1 executed");

    }
    
    public static void choice2(){
        System.out.println("method choice 2 executed");
    }
    
    public static void choice3(){
        System.out.println("method choice 3 executed");
    }
    
    public static void exit(){
        System.out.println("Goodbye");
    }
    
    
}
