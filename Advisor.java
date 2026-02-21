
public class Advisor extends UABPerson{
	
	//advisinglevel=group
	private String schoolDepartment;
	private String advisingLevel;
	
	Advisor(String firstName, String lastName, String blazerID, String schoolDepartment, String advisingLevel) {
		super(firstName, lastName, blazerID);
		
		this.schoolDepartment=schoolDepartment;
		this.advisingLevel=advisingLevel;
	}

	public String getSchoolDepartment() {
		return schoolDepartment;
	}

	public void setSchoolDepartment(String schoolDepartment) {
		this.schoolDepartment = schoolDepartment;
	}

	public String getAdvisingLevel() {
		return advisingLevel;
	}

	public void setAdvisingLevel(String advisingLevel) {
		this.advisingLevel = advisingLevel;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Department: " + getSchoolDepartment() + " " + "Group: " + getAdvisingLevel();

	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "A";
		
	}
	public String toDataBase() {
		return super.toDataBase() + " " + schoolDepartment + " " + advisingLevel;
	}
	}
	

	
		

