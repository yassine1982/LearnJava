/* Challenge Activity 1

Write a java program to input your first name and last name, then say "hello"
two ways, like this:
 
Enter your first name: Michael
Enter your last name: Fudge

Hello, Michael Fudge!  
Or should I say: Fudge, Michael!

*/
package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author mafudge
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String fn=  sc1.nextLine();

        Scanner sc2= new Scanner(System.in);
        System.out.print("Enter your last name : ");
        String ln = sc2.nextLine();
        System.out.println("Hello, " + fn +" "+ ln+ "!");
        System.out.println("Or should I say: "+ fn +" "+ln);
        

    }
    
}
