import java.util.Scanner;
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
        public void displayMenu(){
        System.out.println("please select one of the options below");
        System.out.println("1. Choice1");
        System.out.println("2. Choice2");
        System.out.println("3. Choice3");
        System.out.println("0. Exit");
        }
     public Menu(){
        
        }
        public void processUSerChoices(){
            int userInput;
             do{
        displayMenu();
        Scanner s = new Scanner(System.in);
        userInput = s.nextInt();
        switch(userInput){
            case 1:
            Choice.choice1();
                 break;
            case 2:
            Choice.choice2();
                 break;
            case 3:
            Choice.choice3();
                 break;
            case 4:
            Choice.exit();
                 break;
            default:
                System.out.println("error");
                break;
                }
               
                    
                }
                while(userInput != 4);
            
          
          
        }
        public static void main(String[] args){
            Menu m = new Menu();
            m.processUSerChoices();
            
            
            
            
            
        }
        
        
        
      
    
}
