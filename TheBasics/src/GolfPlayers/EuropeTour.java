package GolfPlayers;

import java.util.Arrays;

public class EuropeTour {
	Player p1;
	Player p2;
	Player p3;
	
	public EuropeTour(Player p1, Player p2, Player p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public void Display(Player p1, Player p2, Player p3)
	{
	
			
		//HighestTours(p1,p2,p3);
		System.out.println("Highest Tours: " +HighestTours(p1,p2,p3));
		System.out.println("England Playrs: " +EndlandPlayers(p1,p2,p3));
		System.out.println("Lowest Tours: " +LowestTours(p1,p2,p3));
		System.out.println("Highest Rank: " +HighestRank(p1,p2,p3));
	}	
	
	public String HighestTours(Player p1, Player p2, Player p3)
	{
		if(p1.tourWins > p2.tourWins){
			if(p1.tourWins > p3.tourWins){return p1.getname();}}
		else {return p3.getname();}
		if(p2.tourWins > p1.tourWins){
		if(p2.tourWins > p3.tourWins){return p2.getname();}}
		else {return p3.getname();}
		return "";
										
	}
	public String EndlandPlayers(Player p1, Player p2, Player p3)
	{
		if(p1.country.equals("England")){return p1.getname();}
		else if(p2.country.equals("England")){return p2.getname();}
		else if(p3.country.equals("England")){return p3.getname();}
		else
		return "";								
	}
	public String LowestTours(Player p1, Player p2, Player p3)
	{
		if(p1.tourWins < p2.tourWins){
			if(p1.tourWins < p3.tourWins){return p1.getname();}}
		else {}
		if(p2.tourWins < p1.tourWins){
			if(p2.tourWins < p3.tourWins){return p2.getname();}}
		else {return p3.getname();}
		return "";									
	}
	public String HighestRank(Player p1, Player p2, Player p3)
	{
		if(p1.worldRanking < p2.worldRanking){
			if(p1.worldRanking < p3.worldRanking){return p1.getname();}}
		else {}
		if(p2.worldRanking < p1.worldRanking){
			if(p2.worldRanking < p3.worldRanking){return p2.getname();}}
		else {return p3.getname();}
		return "";									
	}
}