package cscd211Lab11;

import java.io.*;
import java.util.*;
import cscd211Utils.*;
import cscd211Methods.*;
import cscd211Comparators.*;
import cscd211Classes.teams.*;
import cscd211Generics.MyArrayList;
/**
 * The class that tests all the code for this lab.
 *
 * @NOTE All Parameters will be passed as final and all preconditons will be enforced
 */
public class CSCD211Lab11
{
   public static void main(String [] args)throws Exception
   {
      File inf = null;
      int choice;
      MyArrayList<Team> theTeams = new MyArrayList<Team>();
      Scanner fin = null, kb = new Scanner(System.in);
      
      inf = FileUtils.openInputFile(kb);
      fin = new Scanner(inf);
      CSCD211Lab11Methods.fillArrayList(fin, theTeams);
      theTeams.trimToSize();
      System.out.println("The number of teams is: " + theTeams.size());
      System.out.println();
      fin.close();
      
      do
      {
          choice = CSCD211Lab11Methods.menu(kb);
          switch(choice)
          {
            case 1:  System.out.println();
            		   System.out.println(theTeams + "\n");
                     break;
                     
            case 2:  Collections.sort(theTeams);
                     System.out.println();
            		   System.out.println(theTeams + "\n");
                     break;
                     
            case 3:  Collections.sort(theTeams, new TeamPayrollComparator());
                     System.out.println();
            		   System.out.println(theTeams + "\n");
                     break;
                     
            default: System.out.println("Exiting");
                     
          }// end switch
          
      }while(choice != 4); 
      
      kb.close();

   }// end main
   
}// end class