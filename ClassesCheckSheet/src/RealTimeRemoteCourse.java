
public class RealTimeRemoteCourse extends OnlineCourse {
	
	private String zoom;

	public RealTimeRemoteCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RealTimeRemoteCourse(String courseName, int numStudents, int maxStudents, int credits, String zoom) {
		super(courseName, numStudents, maxStudents, credits);
		this.zoom = zoom;
	}

	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}
	
	@Override
	public String toString() {
		return "Real time remote course: " + "courseName: " + super.getCourse() + ", numStudents=" + super.getNumStudents()
				+ ", maxStudents=" + super.getMaxStudents() + ", credits=" + super.getCredits() + "Zoom info, " + zoom;
	}
	
}
