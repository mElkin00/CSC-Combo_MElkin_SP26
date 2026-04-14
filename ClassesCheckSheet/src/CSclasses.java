import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Course> courseList = new ArrayList<>();
		
		Course course;
		String another = "yes";
		while(another.charAt(0) == 'y') {
			System.out.println("What type of course is it? 1 = In-Person, 2 = RTR, 3 = Full Online");
			int type = input.nextInt();
			System.out.println("What is the course number?");
			String courseName = input.next();
			System.out.println("How many students?");
			int numStudents = input.nextInt();
			System.out.println("What is the maximum number of students?");
			int maxStudents = input.nextInt();
			System.out.println("How many credits?");
			int credits = input.nextInt();
			
			if(type == 1) {
				System.out.println("What is the room number?");
				String roomNum = input.next();
				course = new InPersonCourse(courseName, numStudents, maxStudents, credits, roomNum);
			}
			else if(type == 2) {
				System.out.println("What is the zoom info?");
				String zoom = input.next();
				course = new RealTimeRemoteCourse(courseName, numStudents, maxStudents, credits, zoom);
			}
			else {
				System.out.println("What is the Email?");
				String email = input.next();
				course = new FullRemoteCourse(courseName, numStudents, maxStudents, credits);
			}
			courseList.add(course);
			System.out.println("Do you need to enter another course?");
			another = input.next();
			another = another.toLowerCase();
		}
	}

}
