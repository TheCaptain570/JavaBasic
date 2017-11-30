package Frost;

public class Lanes {
	private String Lane;

	Minion M1 = new Minion("A",50,40);
	Minion M2 = new Minion("B",40,30);
	Minion M3 = new Minion("C",30,20);
	Minion M4 = new Minion("D",50,40);
	Minion M5 = new Minion("E",40,30);
	Minion M6 = new Minion("F",30,20);
	Minion X = new Minion("X",0,0);
	
public Lanes(String Lane) {
	this.Lane = Lane;
}
	
public void Display(){
	System.out.print("Lane(" + Lane +"): " );
	M1.Display();
	if(M2 != null){M2.Display();}
	M3.Display();
	M4.Display();
	if(M5 != null){M5.Display();}
	M6.Display();
	System.out.print("\n");
}	
public void DeathM2(){
	M2 = null;
	
}		
public void DeathM5(){
	M5 = null;
	
}		
	
	
	
}
