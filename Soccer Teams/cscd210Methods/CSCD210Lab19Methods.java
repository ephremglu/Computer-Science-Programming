package cscd210Methods;

import java.io.File;
import java.util.Scanner;
import cscd210Utils.FileUtils;
import cscd210Classes.Team;
import cscd210Classes.Player;


public class CSCD210Lab19Methods
{
	private static final int TEAMS = 32;
	
	/**
	 * Provided for you
	 * @param kb The keyboard object
	 * @return Team [] Array
	 * @throws Exception For the Scanner Object
	 * @throws IllegalArgumentException if kb is null
	 */
	public static Team [] fillTeamsArray(Scanner kb)throws Exception
	{
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner fillTeamsArray");
		
      String [] res = null;
      Player [] players = null;
      String fn, temp;
      Team [] array = new Team[TEAMS];
      
      System.out.print("Please enter the name of the file that contains the team names ");
      fn = kb.nextLine();
      
      File inf = FileUtils.openInputFile(fn);
      Scanner fin = new Scanner(inf);
      
      for(int x = 0; x < array.length; x++)
      {
            temp = fin.nextLine();
            res = temp.split(",");
            players = readPlayers("files/"+res[0]+".txt");
            array[x] = new Team(res[0], res[1], players);           
      
      }// end for
      
      fin.close();
      
      return array;     

	}// end fillTeamArray
   
	
	/**
	 * This method reads a players methods from the file and creates an array of players.  The method is passed the filename of the team. You will need to open the file returning a File object.
	 * Then you will need to create a Scanner object and count the records calling countRecords passing fin and nothing else.  Close the file and then reopen it.  Make an array of players and then 
	 * fill that array with player objects.
	 * @param filename The filename for the file containing that teams players
	 * @return Player [] Each teams array of players
	 * @throws Exception For the Scanner object used to read from the File
	 * @throws IllegalArgumentException if the filename is null or empty
	 */
   private static Player [] readPlayers(String filename)throws Exception
   {
	   if( filename == null || filename.isEmpty())
		   throw new IllegalArgumentException("Bad Params");
      Player [] array = null; 
      File inf = FileUtils.openInputFile(filename);
      Scanner fin = new Scanner(inf);
      int count = FileUtils.countRecords(fin);
      fin.close();
      array = new Player[count];
      inf = FileUtils.openInputFile(filename);
      fin = new Scanner(inf);
      int x = 0; 
      while(fin.hasNextLine())
      {  
    	  String newPlayer = fin.nextLine();
    	  if(!newPlayer.isEmpty())
    	  {
		   String[] subPlayer = newPlayer.split("##");
		   String subPlayerTrim = subPlayer[0].trim(); 
		   String[] tempPlayer = subPlayerTrim.split("  ");
		   Integer number = Integer.parseInt(tempPlayer[0].substring(1, tempPlayer[0].length() - 1));
		   String position = tempPlayer[1];
		   String name = tempPlayer[2];
		   Player player = new Player(name, number, position);
		   array[x] = player;
		   x++;
    	  }
      }
      fin.close();
      return array;
   }

   
   /**
    * Provided for you
    * @param kb Representing the Scanner object to the keyboard
    * @return int Representing the menu choice
    * @throws IllegalArgumentException if the filename is null or empty
    * @NOTE The input buffer is left empty
    */
	public static int menu(Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Bad Scanner fillTeamsArray");
		
      int choice;
      
      do
      {

         System.out.println("1.	Print all Teams to the screen");
		   System.out.println("2.	Print all Teams to the User Specified file");
		   System.out.println("3.	Sort the Teams by Natural Order");
		   System.out.println("4.	Sort the by Team Country Name");
	   	System.out.println("5.	Sort each Team's Players by Number");
	   	System.out.println("6.	Sort each Team's Players by Position");
	   	System.out.println("7.	Print a entire team and only that team to a user specified file");
	   	System.out.println("8.	Quit");
         System.out.print("Choice --> ");
         choice = Integer.parseInt(kb.nextLine());
         
         if(choice < 1 || choice > 8)
            System.out.println("Invalid Choice -- TRY AGAIN");
      
      }while(choice < 1 || choice > 8);

		return choice;

	}// end menu

}
