
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		try (Scanner scanner = new Scanner(new File("uabEmployee.txt"))) {
			while (scanner.hasNextLine()) {
				String[] data = scanner.nextLine().split(" ");
				switch (data[0]) {
				
				case "F":
					Faculty.add(new Faculty(data[1], data[2], data[3], data[4],Integer.parseInt(data[5])));
					break;
				case "S":
					Students.add(new Student(data[1], data[2], data[3], data[4],data[5], Float.parseFloat(data[6])));
					break;
				case "O":
					OfficeAssociates.add(new OfficeAssociates(data[1], data[2], data[3], data[4], data[5]));
					break;
				case "A":
					Advisors.add(new Advisor(data[1], data[2], data[3], data[4], data[5]));
					break;
				case "I":
					ITProfessionals.add(new ITProfessional(data[1], data[2], data[3], data[4]));
					break;
				case "M":
					if(data[4].equalsIgnoreCase("Nurse")) {
						Nurses.add(new Nurse(data[1], data[2], data[3], data[4], data[5], data[6]));
					} else {
						Doctors.add(new Doctor(data[1],data[2],data[3], data[4], data[5]));
					}
					break;
				}
			}
		}
		System.out.println("Welcome to the UAB Employee System");
		System.out.println("The UAB Employee System has the following employees:");
		System.out.println("Total Number of employees = " + (Faculty.size() + Students.size() + OfficeAssociates.size() + Advisors.size() + ITProfessionals.size() + Doctors.size() + Nurses.size()));
		System.out.println(" ");
		
		System.out.println("Faculty:" + Faculty.size());
		for(Faculty faculty:Faculty ) {
			System.out.println(faculty.toString());
		}
		System.out.println(" ");
		System.out.println("Students:" + Students.size());
		for(Student student:Students) {
			System.out.println(student.toString());
		}
		System.out.println(" ");
		System.out.println("Office Associates:" + OfficeAssociates.size());
		for(OfficeAssociates officeAssociate:OfficeAssociates) {
			System.out.println(officeAssociate.toString());
		}
		System.out.println(" ");
		System.out.println("Advisors:" + Advisors.size());
		for(Advisor advisor:Advisors) {
			System.out.println(advisor.toString());
		}
		System.out.println(" ");
		System.out.println("IT Professionals:" + ITProfessionals.size());
		for(ITProfessional itProfessional:ITProfessionals) {
			System.out.println(itProfessional.toString());
		}
		System.out.println(" ");
		System.out.println("Total Medical Staff:" + (Doctors.size() + Nurses.size()));
		System.out.println("Doctors:" + Doctors.size());
		for(Doctor doctor:Doctors) {
			System.out.println(doctor.toString());
		}
		System.out.println(" ");
		System.out.println("Nurses:" + Nurses.size());
		for(Nurse nurse:Nurses) {
			System.out.println(nurse.toString());
		}

		try (PrintWriter writer = new PrintWriter("uabEmployee.txt")){
			for(Faculty faculty:Faculty ) {
				writer.println(faculty.toDataBase());
			}
			for(Student student:Students) {
				writer.println(student.toDataBase());
			}
			for(OfficeAssociates officeAssociate:OfficeAssociates) {
				writer.println(officeAssociate.toDataBase());
			}
			for(Advisor advisor:Advisors) {
				writer.println(advisor.toDataBase());
			}
			for(ITProfessional itProfessional:ITProfessionals) {
				writer.println(itProfessional.toDataBase());
			}
			for(Nurse nurse:Nurses) {
				writer.println(nurse.toDataBase());
			}
			for(Doctor doctor:Doctors) {
				writer.println(doctor.toDataBase());
			}
		}
	}
	
	public static void removePerson(String role, String blazerID) {
		switch (role.toUpperCase()) {
		case "F":
			removeFromList(Faculty, blazerID);
			break;
		case "S":
			removeFromList(Students, blazerID);
			break;
		case "O":
			removeFromList(OfficeAssociates, blazerID);
			break;
		case"A":
			removeFromList(Advisors, blazerID);
			break;
		case "I":
			removeFromList(ITProfessionals, blazerID);
			break;
		case "M":
			removeFromList(Doctors, blazerID);
			removeFromList(Nurses, blazerID);
			break;
			
		}
	}

	private static <R extends UABPerson> void removeFromList(ArrayList<R> list, String blazerID) {
		Iterator<R> iterator = list.iterator();
		while(iterator.hasNext()) {
			R person = iterator.next();
			if(person.getBlazerID().equalsIgnoreCase(blazerID)) {
				iterator.remove();
				System.out.println("Person Removed:" + person);
				return;
			}
		}
	}




	
	private static ArrayList<Faculty> Faculty = new ArrayList<>();
	private static ArrayList<Student> Students = new ArrayList<>();
	private static ArrayList<OfficeAssociates> OfficeAssociates = new ArrayList<>();
	private static ArrayList<Advisor> Advisors = new ArrayList<>();
	private static ArrayList<ITProfessional> ITProfessionals = new ArrayList<>();
	private static ArrayList<Doctor> Doctors = new ArrayList<>();
	private static ArrayList<Nurse> Nurses = new ArrayList<>();
	
}

