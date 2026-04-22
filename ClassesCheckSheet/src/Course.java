
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

	/**
	 * This will retrieve the code from the other files in the project
	 * 
	 * @param courseName --retrieve the course name class
	 * @param numStudents --retrieves the number of students class
	 * @param maxStudents -- retrieves the maximum number of students class
	 * @param credits --retrieves the credits class
	 */
	public Course(String courseName, int numStudents, int maxStudents, int credits) {
		super();
		this.courseName = courseName;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	/**
	 * This will get the course name
	 * 
	 * @return --returns the course name
	 */
	public String getCourse() {
		return courseName;
	}

	/**
	 * This sets the course name to whatever is entered
	 * 
	 * @param course -- allows you to set the course name
	 */
	public void setCourse(String course) {
		this.courseName = course;
	}

	/**
	 * This will get the number of students in the class
	 * 
	 * @return -- returns whatever is entered
	 */
	public int getNumStudents() {
		return numStudents;
	}

	/**
	 * This will set the number of students in the class
	 * 
	 * @param numStudents -- allows you to set the number of students in the class
	 */
	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	/**
	 * This will get the maximum number of students
	 * 
	 * @return --returns the maximum number of students
	 */
	public int getMaxStudents() {
		return maxStudents;
	}

	/**
	 * This allows you to set the maximum number of students
	 * 
	 * @param maxStudents -- allows you to set the maximum number of students
	 */
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	/**
	 * This gets the number of credits for the class
	 * 
	 * @return --returns the number of credits entered by the user
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * This allows a user to set the number of credits for the class
	 * 
	 * @param credits --lets the user set the number of credits the class gives you
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * This will print out the course name, number of students, maximum number of students, and the credits
	 *
	 */
	@Override
	public String toString() {
		return "The course number is: " + courseName + 
				"The number of students is: " + numStudents +
				"The maximum amount of students is: " + maxStudents +
				"The number of credits is: " + credits;
	}
	
	
	
}
