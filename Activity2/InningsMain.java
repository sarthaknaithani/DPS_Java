import java.util.Scanner;

class Innings
{
	private String teamname;
	private String inningsname;
	private int runs;
	
	void setteamname(String teamname)
	{
		this.teamname = teamname;
	}
	void setinningsname(String inningsname)
	{
		this.inningsname= inningsname;
	}
	void setruns(int runs)
	{
		this.runs = runs;
	}
  String getteamname() {
		return this.teamname;
	}
	String getinningsname() {
		return this.inningsname;
	}
  int getruns()
  {
	  return this.runs;
  }
  			
  			void displayInningsDetails()
  			{  
  				System.out.println("Employee Details");
  				System.out.println("Name:" + getteamname());
  				System.out.println("Scored:" + getruns());
  				if(getinningsname().equals("first"))
  				{
  					System.out.println("Need "+ (runs+1) + "to win");
  				}
  				else
  				{
  					System.out.println("Match Ended");
  				}
  			}
}

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innings E = new Innings();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the team name:");
		E.setteamname(sc.nextLine());
		System.out.println("Enter Session:");
		E.setinningsname(sc.nextLine());
		System.out.println("Enter runs:");
		E.setruns(sc.nextInt());
		 
		E.displayInningsDetails();
	}

}
