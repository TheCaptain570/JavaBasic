package GolfPlayers;

public class Player {
	String name; 
	String country;
	int tourWins;
	int winsThisSeason;
	int worldRanking;
	double biggestPrize;
	
public Player(String name,String country,int tourWins,int winsThisSeason,int worldRanking,double biggestPrize){
	this.name = name;
	this.country = country;
	this.tourWins = tourWins;
	this.winsThisSeason = winsThisSeason;
	this.worldRanking = worldRanking;
	this.biggestPrize = biggestPrize;
}

public void Display()
{
		System.out.println("Player Stats");
		System.out.println("Name = " + this.name);
		System.out.println("Country = " + this.country);
		System.out.println("Tour Wins =  " + this.tourWins);
		System.out.println("Wins This Season = " + this.winsThisSeason);
		System.out.println("World Ranking = " + this.worldRanking);
		System.out.println("Biggest Prize =  " + this.biggestPrize+"m");
}



public String getname() {
    return name;
}

public  void setname(String name) {
    this.name = name;
}
public  String getCountry() {
	return country;
}
public  void setCountry(String country) {
	this.country = country;
}
public  int getTourWins() {
	return tourWins;
}
public  void setTourWins(int tourWins) {
	this.tourWins = tourWins;
}
public  int getWinsThisSeason() {
	return winsThisSeason;
}
public  void setWinsThisSeason(int winsThisSeason) {
	this.winsThisSeason = winsThisSeason;
}
public  int getWorldRanking() {
	return worldRanking;
}
public  void setWorldRanking(int worldRanking) {
	this.worldRanking = worldRanking;
}
public  double getBiggestPrize() {
	return biggestPrize;
}
public  void setBiggestPrize(double biggestPrize) {
	this.biggestPrize = biggestPrize;
}


}
