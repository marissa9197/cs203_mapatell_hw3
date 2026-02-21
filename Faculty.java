
public class Faculty extends UABPerson{
	
	private String teachingDdepartment;
	private int coursesTaught;
	
	Faculty(String firstName, String lastName, String blazerID, String teachingDepartment, int coursesTaught) {
		super(firstName, lastName, blazerID);
		
		this.teachingDdepartment=teachingDepartment;
		this.coursesTaught=coursesTaught;
		
		
	}

	public String getTeachingDdepartment() {
		return teachingDdepartment;
	}

	public void setTeachingDdepartment(String teachingDdepartment) {
		this.teachingDdepartment = teachingDdepartment;
	}

	public int getCoursesTaught() {
		return coursesTaught;
	}

	public void setCoursesTaught(int coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Department: " + getTeachingDdepartment() + " " + "Courses: " + getCoursesTaught();
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "F";
	}
	public String toDataBase() {
		return super.toDataBase() + " " + teachingDdepartment + " " + coursesTaught;
	}

}
