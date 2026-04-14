
public class InPersonCourse extends Course{

	private String roomNum;

	public InPersonCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InPersonCourse(String courseName, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseName, numStudents, maxStudents, credits);
		this.roomNum = "";
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return "InPersonCourse [roomNum=" + roomNum + ", courseName=" + super.getCourse() + ", numStudents=" + super.getNumStudents()
				+ ", maxStudents=" + super.getMaxStudents() + ", credits=" + super.getCredits() + "]";
	}

	
}
