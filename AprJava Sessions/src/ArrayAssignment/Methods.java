package ArrayAssignment;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		obj.test();
		String name = obj.getTrainerName();
		System.out.println(name);
		int teamname = obj.getTeamPlayer();
		System.out.println(teamname);
		int SumNumbers = obj.sum(5, 7);
		System.out.println(SumNumbers);
		String CountryNam = obj.grinetCapitalcityName("UK");
		System.out.println(CountryNam);
		ArrayList<String> studentnam = obj.getStudentNames("java");
		System.out.println(studentnam);
		
		
	}
    
	//no input and no return
	public void test() {
		System.out.println("Test Method");
	}
	//no input and some return
	public String getTrainerName() {
		System.out.println("getTrainerName");
		String name="Naveen";
		return name;
	}
	public int getTeamPlayer() {
		System.out.println("getTeamPlayer");
		int playcount = 11;
		int extraplayers = 2;
		int totalNumberPlayers = playcount + extraplayers;
		return totalNumberPlayers;
	}
	//some input and some return
	public int sum(int x,int y) {
		System.out.println("Sum Method");
		int z = x + y;
		return z;
	}
   	
   public String grinetCapitalcityName(String countryname) {
	   System.out.println("getCapitalcityname");
	   if(countryname.equals("india")) {
		   return "Delhi Captial";
	   }

	   
	   
	   return "No Captial";
   }
   
   public ArrayList<String> getStudentNames(String batchName) {
	   ArrayList<String> studentNames = new ArrayList<String>();
	   System.out.println("getStudentNames");
	   
	   if(batchName.equals("java")) {
		   studentNames.add("Rahul");
		   studentNames.add("Mohan");
		   studentNames.add("Somu");
		   }
	   else if(batchName.equals("python")) {
		   studentNames.add("Sushu");
		   studentNames.add("Navya");
		   studentNames.add("Mohini");
		   studentNames.add("Garisha");   
	   }
	   return studentNames;
   }
   
   
   
   
   
}
		