package MessagesBase;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PlayerRegistration extends java.lang.Object {

	@NotNull
	@Size(min = 1, max = 50)
	private String studentFirstName;

	@NotNull
	@Size(min = 1, max = 50)
	private String studentLastName;

	@NotNull
	@Size(min = 1, max = 50)
	private String studentID;

	PlayerRegistration() {

	}
	
	public PlayerRegistration(@NotNull @Size(min = 1, max = 50) String studentFirstName,
			@NotNull @Size(min = 1, max = 50) String studentLastName,
			@NotNull @Size(min = 1, max = 50) String studentID) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentID = studentID;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public String getStudentID() {
		return studentID;
	}

	

}
