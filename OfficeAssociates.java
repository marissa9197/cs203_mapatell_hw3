
public class OfficeAssociates extends UABPerson{
	
	private String officeSpecialty;
	private String officeDepartment;
	
	OfficeAssociates(String firstName, String lastName, String blazerID, String officeSpecialty, String officeDepartment) {
		super(firstName, lastName, blazerID);
		
		this.officeSpecialty=officeSpecialty;
		this.officeDepartment=officeDepartment;
	}

	public String getOfficeSpecialty() {
		return officeSpecialty;
	}

	public void setOfficeSpecialty(String officeSpecialty) {
		this.officeSpecialty = officeSpecialty;
	}

	public String getOfficeDepartment() {
		return officeDepartment;
	}

	public void setOfficeDepartment(String officeDepartment) {
		this.officeDepartment = officeDepartment;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Role: " + getOfficeSpecialty() + " " + "Department: " + getOfficeDepartment();
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "O";
	}
	public String toDataBase() {
		return super.toDataBase() + " " + officeSpecialty + " " + officeDepartment;
	}

}
