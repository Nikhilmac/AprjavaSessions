package OOP3_Interface;

public class FortisHospital implements UsMedical,UKMedical,IndiaMedical {
      
	  @Override
	  public void cardioServices() {
		  System.out.println("Fortis ......cardio");
	  }
	  @Override
      public void ambulanceServices() {
    	  System.out.println("Fortis......ambulance");
      }
	  @Override
      public void physioServices() {
    	  System.out.println("Fortis.........Physio");
      }
	  
	    @Override
	    public void ancologyServices() {
	    	System.out.println("Fortis.....Ancology");
	    	
		  
	    }
	    @Override
		public void OutPatientServices() {
	    	System.out.println("Fortis.....OutPatident");
			
		}
	    
	    @Override
		public void dentalServices() {
	    	System.out.println("Fortis.....Dental");
			
		}
	    @Override
	    public void emergencyServices() {
	    	System.out.println("Fortis.....EmergencyServices");
}
	    @Override
		public void ENTServices() {
	    	System.out.println("Fortis.....EntServies");
	    	
	    }
	    @Override
	    public void radiologyServices() {
	    	System.out.println("Fortis.....Radiology");
	    	
	    }
		

      public void medicalInsurance() {
    	  System.out.println("Fortis...........MedicalInsurance");
      }

      public void studentIntership() {
    	  System.out.println("Fortis..........StudentIntership");
      }
      
      

}



