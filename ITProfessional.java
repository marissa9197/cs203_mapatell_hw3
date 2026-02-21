
public class ITProfessional extends UABPerson{
	
	private String team;
	
	ITProfessional(String firstName, String lastName, String blazerID, String team) {
		super(firstName, lastName, blazerID);
		
		this.team=team;
		
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return super.toString() + "Team: " + getTeam();
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "I";
	}
	public String toDataBase() {
		return super.toDataBase() + " " + team;
	}
	
	

}
