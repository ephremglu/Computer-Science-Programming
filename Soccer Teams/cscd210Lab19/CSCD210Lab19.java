package cscd210Lab19;

import java.io.*;
import java.util.*;

import cscd210Classes.Player;
import cscd210Classes.Team;
import cscd210Utils.*;
import cscd210Comparators.*;
import cscd210Methods.*;

/**
 * The class that contains main for the world cup assignment
 * @NOTE all parameters will be final and all preconditions will be met
 */
public class CSCD210Lab19
{
	/**
	 * The main method
	 * @param args Representing the command line arguments
	 * @throws Exception To quiet the Scanner object for reading and writing to files
	 */
	public static void main(String [] args)throws Exception
	{
		int choice;
		String fn = null;
	    PrintStream fout = null;
	    Player [] players = null;
		Scanner kb = new Scanner(System.in);
      
		Team [] worldCupTeams = null;
            
		worldCupTeams = CSCD210Lab19Methods.fillTeamsArray(kb);
		
		do
		{
			System.out.println();
			choice = CSCD210Lab19Methods.menu(kb);
			System.out.println();
			
			  switch(choice)
		      {
		         case 1:  ArrayUtils.printArray(worldCupTeams, System.out);
		                  		break;
		                  
		         case 2:  System.out.print("Please enter the name of the output file ");
		                  		fn = kb.nextLine();
		                  		fout = new PrintStream(fn);
		                  		ArrayUtils.printArray(worldCupTeams, fout);
		                  		fout.close();
		                  		break;
		                  
		         case 3:  SortUtils.selectionSort(worldCupTeams);
		         				ArrayUtils.printArray(worldCupTeams, System.out);
		         				break;
		                  
		         case 4:  Arrays.sort(worldCupTeams, new TeamCountryComparator());
		         				ArrayUtils.printArray(worldCupTeams, System.out);
		                  		break;
		                  
		         case 5:  players = null;  
		                  		for(Team t: worldCupTeams)
		                  		{
		                  				players = t.getPlayers();
		                  				SortUtils.selectionSort(players);
		                  				t.setPlayers(players);
		                     
		                  		}// end for
		                  		ArrayUtils.printArray(worldCupTeams, System.out);
		                  		break;
		                     
		            
		         case 6:  for(Team t: worldCupTeams)
		                  		{
		                     		players = t.getPlayers();
		                     		Arrays.sort(players, new PlayerPositionComparator());
		                     		t.setPlayers(players);
		                  		}// end for
		         				ArrayUtils.printArray(worldCupTeams, System.out);
		                  		break;

		         case 7:  Team [] theOne = new Team[1];
		                  		System.out.print("Please enter the team 3 letter code ");
		                  		String code = kb.nextLine();
		                  		for(Team t : worldCupTeams)
		                  		{   
		                  				if(t.getCode().equalsIgnoreCase(code))
		                  					theOne[0] = t;
		                        
		                  		}// end for
		                  
		                  		System.out.print("Please enter the name of the output file ");
		                  		fn = kb.nextLine();
		                  		fout = new PrintStream(fn);
		                  		ArrayUtils.printArray(theOne, fout);
		                  		fout.close();
		                  		break;
		                          
		         default: System.out.println("Bye");
		            
		      }// end switch
			  
		}while (choice != 8);

	}// end main


   
}// end class