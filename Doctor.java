
public class Doctor extends MedicalStaff{
	
	
	//specialty=role
	Doctor(String firstName, String lastName, String blazerID, String role, String medicalDepartment) {
		super(firstName, lastName, blazerID, role, medicalDepartment);
	}
		
		
	
	@Override
	public String toString() {
		return super.toString() + "Role: " + getRole() + " " + "Department: " + getMedicalDepartment();
	}



	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "D";
	}

	

}
