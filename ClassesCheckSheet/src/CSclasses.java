import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {
	public static MyFileWriter fw = new MyFileWriter("courses.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyFileReader reader = new MyFileReader("courses.txt");
		ArrayList<Course> courseList = reader.getList();
		
		Course course;
		String another = "yes";
		File file = fw.getFile();
		
		while(another.charAt(0) == 'y') {
			System.out.println("What type of course is it? 1 = In-Person, 2 = RTR, 3 = Full Online");
			int type = input.nextInt();
			if(type == 4)break;
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
				course = new FullRemoteCourse(courseName, numStudents, maxStudents, credits, email);
			}
			courseList.add(course);
			addToFile(file, course);
			System.out.println("Do you need to enter another course?");
			another = input.next();
			another = another.toLowerCase();
			
		}
		
		for(Course course1 : courseList) {
			getPrinter(course1);
			
		}
		
	}
	
	public static void addToFile(File file, Course course) {
		if(course instanceof InPersonCourse) {
			fw.appendToFile(file, "IP ");
			InPersonCourse ipcourse = (InPersonCourse) course;
			fw.appendToFile(file, ipcourse.getRoomNum() + " ");
		}
		else if(course instanceof FullRemoteCourse) {
			fw.appendToFile(file, "FR ");
			FullRemoteCourse frcourse = (FullRemoteCourse) course;
			fw.appendToFile(file, frcourse.getEmail() + " ");
		}
		else if(course instanceof RealTimeRemoteCourse) {
			fw.appendToFile(file, "RTR ");
			RealTimeRemoteCourse rtrcourse = (RealTimeRemoteCourse) course;
			fw.appendToFile(file, rtrcourse.getZoom() + " ");
		}
		fw.appendToFile(file, course.getCourse() + " ");
		fw.appendToFile(file, course.getNumStudents() + " ");
		fw.appendToFile(file, course.getMaxStudents() + " ");
		fw.appendToFile(file, course.getCredits() + "\n");
		
	}
	
	public static void print(Course course) {
		System.out.println(course);
	}
	
	public static void getPrinter(Course course) {
		System.out.println("Course:" + course.getCourse() );
		System.out.println("Number of Students:" + course.getNumStudents());
		System.out.println("Max Students:" + course.getMaxStudents());
		System.out.println("Credits:" + course.getCredits());
		if(course instanceof InPersonCourse) {
			InPersonCourse IPcourse = (InPersonCourse)course;
			System.out.println(IPcourse.getRoomNum());
		}
		else if(course instanceof FullRemoteCourse) {
			FullRemoteCourse FRCourse = (FullRemoteCourse)course;
			System.out.println(FRCourse.getEmail());
		}
		else if (course instanceof RealTimeRemoteCourse) {
			RealTimeRemoteCourse RTCourse = (RealTimeRemoteCourse)course;
			System.out.println(RTCourse.getZoom());
		}
		
	}
	
}
