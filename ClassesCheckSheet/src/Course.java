
public class Course {
	private String courseName;
	private int numStudents;
	private int maxStudents;
	private int credits;
	
	
	
	public Course() {
		super();
		this.courseName = "";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}

	public Course(String courseName, int numStudents, int maxStudents, int credits) {
		super();
		this.courseName = courseName;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourse() {
		return courseName;
	}

	public void setCourse(String course) {
		this.courseName = course;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "The course number is: " + courseName + 
				"The number of students is: " + numStudents +
				"The maximum amount of students is: " + maxStudents +
				"The number of credits is: " + credits;
	}
	
	
	
}
