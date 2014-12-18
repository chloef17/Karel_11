/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import edu.fcps.karel2.Robot;
import edu.fcps.Digit;


public class Lab11 {
	 
	 public static void main(String[] args) {
    
    Display.setSize(42, 37);
    Display.setSpeed(10);
            
    
    Digit first = new Zero(1, 9);
    Digit second = new Eight(7, 9);
    Digit third = new Five(13, 9);
    Digit fourth = new Nine(19, 9);
    Digit fifth = new Seven(25, 9);
    Digit sixth = new Six(31, 9);
    
    first.display();
    second.display();
    third.display();
    fourth.display();
    fifth.display();
    sixth.display();
   
	 }
	 
 }