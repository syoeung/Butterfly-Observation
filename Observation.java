/* Psuedo Code
      Purpose- Gather observating data , calculate observation factor and echoing input back to user 
      Input- Name , observation description , observation count
      Processing- Calculating observation factor ( observationCount + observationConstant )
      Output- User input and observation factor
*/

import javax.swing.JOptionPane;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Scanner;

public class Observation {
  
  public static void main(String[] args) {
 //Data dictionary - housing all the variables used
   String buffer = "";
   String name = "";
   String body = "";
   int observationCount = 0;
   final float observationConstant = .27f; /*appending f to specify floating point literal */
   double observationFactor = 0.0;
   Date timeStamp = new Date();
   Timestamp tS = new Timestamp(timeStamp.getTime()); 
   Scanner kbd = new Scanner(System.in);
   
 //Processing
   JOptionPane.showMessageDialog(null , tS);
   buffer = JOptionPane.showInputDialog("Enter your name: ");
   name = buffer;
   buffer = JOptionPane.showInputDialog("Enter the description of " + "your observation: ");
   body = buffer;
   buffer = JOptionPane.showInputDialog("How many D. plexippus " + "did you see? ");
   observationCount = Integer.parseInt(buffer);
   observationFactor = observationCount * observationConstant;
   JOptionPane.showMessageDialog(null, tS + "\nName: " + name + "\nBody: " + body + "\nObservation count: " + observationCount + "\nObservation factor: " + observationFactor);
   
   System.exit(0);  /* put it at last line of code */ 
  }
}
