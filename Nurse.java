
public class Nurse extends MedicalStaff{
	
	private String onCall;
	
	Nurse(String firstName, String lastName, String blazerID, String role, String medicalDepartment, String onCall) {
		super(firstName, lastName, blazerID, role, medicalDepartment);
		
		this.onCall=onCall;
	}

	public String getOnCall() {
		return onCall;
	}

	public void setOnCall(String onCall) {
		this.onCall = onCall;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Role: " + getRole() + " " + "Department: " + getMedicalDepartment() + " " + "On Call: " + getOnCall();

}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "N";
	}
	public String toDataBase() {
		return super.toDataBase() + " " + onCall;
	}
	}
