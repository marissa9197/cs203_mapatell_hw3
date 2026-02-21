
public class Student extends UABPerson{
	
	private String grade;
	private String major;
	private float GPA;
	
	Student (String firstName, String lastName, String blazerID, String grade, String major, float GPA) {
		super(firstName, lastName, blazerID);
		
		this.grade=grade;
		this.major=major;
		this.GPA=GPA;
		
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float GPA) {
		this.GPA = GPA;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Grade: " + getGrade() + " " + "Major: " + getMajor() + " " + "GPA: " + getGPA();
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "S";
	}
	public String toDataBase() {
		return super.toDataBase() + " " + grade + " " + major + " " + GPA;
	}

}
