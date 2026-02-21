
public abstract class UABPerson {
	
	
	private final String firstName;
	private final String lastName;
	private final String blazerID;
	
	public UABPerson(String firstName, String lastName, String blazerID) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.blazerID=blazerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getBlazerID() {
		return blazerID;
	}

	public abstract String type();
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + " " + "BlazerId: " + blazerID + " ";

	}
	
	public String toDataBase() {
		return type() + firstName +" " + lastName + " " + blazerID;
	}
	}
