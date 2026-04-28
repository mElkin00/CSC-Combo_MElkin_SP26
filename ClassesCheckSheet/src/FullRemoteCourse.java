
public class FullRemoteCourse extends Course {

	private String email;

	public FullRemoteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullRemoteCourse(String courseName, int numStudents, int maxStudents, int credits, String email) {
		super(courseName, numStudents, maxStudents, credits);
		// TODO Auto-generated constructor stub
	}

	public FullRemoteCourse(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Full time remote course: " + "courseName" + super.getCourse() + ", numStudents=" + super.getNumStudents()
				+ ", maxStudents=" + super.getMaxStudents() + ", credits=" + super.getCredits() + "Email, " + email;
	}
	
	
	
}
