package GamyCode;

public class StatsDisplay {

	static public String PrimanyAttribute;
	static public String Name;
	static public String Sex;
	static public String age ;
	static public String Description;
	static public int Value;
	
	static String [][] Stats = new String[][]{
		{"","","",""},
		{"Katarina","F","18","Kniffy Girl"},
		{"WindRanger","F","21","Windy Girl"},
		{"Bounty Hunter","M","45"," Angry Goblin"},
		{"Lucian","M","45","Gun Guy"},
		{"Varus","M","77","Bow Guy"},
		{"","","",""},
		{"Ryze","M","1800","Old Smurf"},
		{"Morgana","F","21","Demon girl"},
		{"Silencer","M","45","Shhhhhhhhh"},
		{"Pugna","F","45","Beware will suck you off"},
		{"Puck","F","77","Fairy thing ?"},
		{"","","",""},
		{"Darius","M","180","Axe but human"},
		{"Axe","M","213","Darius but Red"},
		{"Juggernaut","M","45","JUGGERNAUT!!!!!"},
		{"DrMundo","M","45","Mundo? Mundo mundo"},
		{"Talon","M","77","Parkor"}
	};
	
	 public StatsDisplay(int NewValue)
	 {
		 	this.Value = NewValue;
			this.Name = Stats[Value][0];
			this.Sex = Stats[Value][1];
			this.age = Stats[Value][2];
			this.Description = Stats[Value][3];
	 }
	 static public void Dexdisplay()
	 {
			System.out.println("Name = " + Stats[Value][0]);
			System.out.println("Sex = " + Stats[Value][1]);			
			System.out.println("Age = " + Stats[Value][2]);
			System.out.println("Description = " + Stats[Value][3]);
			BreakBetweenSelection();
	}
	 static public void Intdisplay()
	 {
		 	Value = Value + 6;
			System.out.println("Name = " + Stats[Value][0]);
			System.out.println("Sex = " + Stats[Value][1]);			
			System.out.println("Age = " + Stats[Value][2]);
			System.out.println("Description = " + Stats[Value][3]);
			BreakBetweenSelection();
	}	
	
	 static public void Strdisplay()
	 {
		 	Value = Value+11;
			System.out.println("Name = " + Stats[Value][0]);
			System.out.println("Sex = " + Stats[Value][1]);			
			System.out.println("Age = " + Stats[Value][2]);
			System.out.println("Description = " + Stats[Value][3]);
			BreakBetweenSelection();
	}	
	 static public void BreakBetweenSelection()
	 {
			System.out.println("\n\n\n\n\n\n\n\n\n");

	}
}//end class


