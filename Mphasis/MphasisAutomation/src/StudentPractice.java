
public class StudentPractice{

	public static void main(String[] args) {
//		System.out.println("Hello");
		StudentPractice stud = new StudentPractice();
		
		String id = stud.getId();
		System.out.println("Student Id::"+ id);
		System.out.println("-----------------------------");
		
		String name = stud.getName();
		System.out.println("Student Name::"+ name);
		System.out.println("-----------------------------");
		
		int yearOfJoining = stud.yearOfJoining(2026);
		System.out.println("Year of joining::" + yearOfJoining);
		
	}
//	mehod for fetching Id
	public String getId() {
//		System.out.println("");
		return "mphasis123";
	}
	
//	Method for fetching Student name
	public String getName() {
		return "Vivek";
	}
	
//	Method for getting year of joining
	public int yearOfJoining(int year) {
		return year;
	}
}