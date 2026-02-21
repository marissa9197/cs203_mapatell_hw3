
public abstract class MedicalStaff extends UABPerson{ 
		
		private String medicalDepartment;
		private String role;
		
		public MedicalStaff(String firstName, String lastName, String blazerID, String role, String medicalDepartment) {
			super(firstName, lastName, blazerID);
			this.medicalDepartment=medicalDepartment;
			this.role=role;
		}
		
		public String getMedicalDepartment() {
			return medicalDepartment;
		}
		public void setMedicalDepartment(String medicalDepartment) {
			this.medicalDepartment = medicalDepartment;
	
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role=role;
	}
		public String toDataBase() {
			return super.toDataBase() + " " + role + " " + medicalDepartment;
		}
}
	
	


