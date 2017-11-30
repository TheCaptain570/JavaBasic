package GamyCode;

public class Heros {

	static public String PrimanyAttribute;
	static public String Name;
	static public String Sex;
	static public String age ;
	static public String Description;
	static public int Value;
	
	static String [][] DexStats = new String[][]{
		{"","","",""},
		{"Katarina","F","18","Kniffy Girl"},
		{"WindRanger","F","21","Windy Girl"},
		{"Bounty Hunter","M","45"," Angry Goblin"},
		{"Lucian","M","45","Gun Guy"},
		{"Varus","M","77","Bow Guy"}
	};
	static String [][] IntStats = new String[][]{
		{"","","",""},
		{"Ryze","M","1800","Old Smurf"},
		{"Morgana","F","21","Demon girl"},
		{"Silencer","M","45","Shhhhhhhhh"},
		{"Pugna","F","45","Beware will suck you off"},
		{"Puck","F","77","Fairy thing ?"}
	};	
	static String [][] StrStats = new String[][]{
		{"","","",""},
		{"Darius","M","180","Axe but human"},
		{"Axe","M","213","Darius but Red"},
		{"Juggernaut","M","45","JUGGERNAUT!!!!!"},
		{"DrMundo","M","45","Mundo? Mundo mundo"},
		{"Talon","M","77","Parkor"}
	};
	 public Heros(int NewValue)
	 {
		 	this.Value = NewValue;
			this.Name = DexStats[Value][0];
			this.Sex = DexStats[Value][1];
			this.age = DexStats[Value][2];
			this.Description = DexStats[Value][3];
	 }
	 static public void Dexdisplay()
	 {
			System.out.println("Name = " + DexStats[Value][0]);
			System.out.println("Sex = " + DexStats[Value][1]);			
			System.out.println("Age = " + DexStats[Value][2]);
			System.out.println("Description = " + DexStats[Value][3]);

	}
	 static public void Intdisplay()
	 {
			System.out.println("Name = " + IntStats[Value][0]);
			System.out.println("Sex = " + IntStats[Value][1]);			
			System.out.println("Age = " + IntStats[Value][2]);
			System.out.println("Description = " + IntStats[Value][3]);

	}	
	
	 static public void Strdisplay()
	 {
			System.out.println("Name = " + StrStats[Value][0]);
			System.out.println("Sex = " + StrStats[Value][1]);			
			System.out.println("Age = " + StrStats[Value][2]);
			System.out.println("Description = " + StrStats[Value][3]);

	}	
	
	
	
	
	
}


