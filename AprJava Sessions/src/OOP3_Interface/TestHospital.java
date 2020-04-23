package OOP3_Interface;

public class TestHospital {
	
	public static void main(String[] args) {
		
	
	
	
	FortisHospital fs = new FortisHospital();
	 
	fs.cardioServices();
	fs.ambulanceServices();
	fs.physioServices();
	
	fs.ancologyServices();
	fs.OutPatientServices();
	fs.dentalServices();
	
	fs.emergencyServices();
	fs.ENTServices();
	fs.radiologyServices();
	
	fs.medicalInsurance();
	fs.studentIntership();
	
	  //Usmedical ms = new Usmedical(); Cannot create Object for Interface
	
	  System.out.println(fs.min_fee);
	  System.out.println(UsMedical.min_fee);
	  
	  fs.test();
	  
	  UsMedical.display();
	  
	  
	  
      UsMedical us =new FortisHospital();
	
      us.ambulanceServices();
      us.physioServices();
      us.cardioServices();
      
      
      UKMedical uk =new FortisHospital();

      
      IndiaMedical im = new FortisHospital();
	 
  
	
	
	}
}
