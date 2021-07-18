package cscd211Methods;

import cscd211Classes.players.BaseballPlayer;
import cscd211Classes.players.FootballPlayer;
import cscd211Classes.players.HockeyPlayer;
import cscd211Classes.players.Player;
import cscd211Classes.teams.Team;
import cscd211Generics.MyArrayList;

public class CSCD211Lab11Methods extends java.lang.Object
{
	public static void fillArrayList(final java.util.Scanner fin, final MyArrayList<Team> myTeam) throws CloneNotSupportedException
    {
		if(fin == null || myTeam == null)
			throw new IllegalArgumentException("fin or myTeam being null");
		while(fin.hasNext())
		{
			String city = fin.nextLine();
			int totalTeams = Integer.parseInt(fin.nextLine());
			Team team = null;
			while(totalTeams != 0)
			{
				String line = fin.nextLine();
				String[] res = line.split(", ");
				String sport = res[0].trim();
				String sportName = res[1].trim();
				int totalPlayers = Integer.parseInt(fin.nextLine());
				Player[] temp = new Player[totalPlayers];
				int x = 0;
				totalTeams--;
				
				while(totalPlayers != 0)
				{
					line = fin.nextLine();
					res = line.split(", ");
					totalPlayers--;
					if(sport.equalsIgnoreCase("Football"))
					{
						temp[x] = new FootballPlayer(res[0], res[1], Integer.parseInt(res[2]), res[3], Integer.parseInt(res[4]), Integer.parseInt(res[5]));
						x++;
					}
					
					if(sport.equalsIgnoreCase("Baseball"))
					{
						temp[x] = new BaseballPlayer(res[0], res[1], Integer.parseInt(res[2]), res[3], Double.parseDouble(res[4]));
						x++;
					}
					
					if(sport.equalsIgnoreCase("Hockey"))
					{
						temp[x] = new HockeyPlayer(res[0], res[1], Integer.parseInt(res[2]), res[3], Integer.parseInt(res[4]));
						x++;
					}
				}
				team = new Team(city, sportName, temp);
				myTeam.addLast(team);
			}
		}
    }
	
	public static int menu(final java.util.Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner is null");
      int choice;
      do
      {
    	  System.out.println("1 Print all Teams");
		  System.out.println("2. Sort all Teams by city and team name ");
		  System.out.println("3. Sort all Teams by Payroll");
	   	  System.out.println("4. Quit");
          System.out.print("Choice --> ");
          choice = Integer.parseInt(kb.nextLine());
          if(choice < 1 || choice > 4)
             System.out.println("Invalid Choice -- TRY AGAIN");
      }while(choice < 1 || choice > 4);
		return choice;
	}
}