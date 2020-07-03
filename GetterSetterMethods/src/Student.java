
public class Student {

	private String name;
	private int matrikelNumber;
	private String university;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatrikelNumber() {
		return matrikelNumber;
	}

	public void setMatrikelNumber(int matrikelNumber) {
		this.matrikelNumber = matrikelNumber;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	
	public void toString(String string) {
		System.out.println(this.getName());
		System.out.println(this.getMatrikelNumber());
		System.out.println(this.getUniversity());
		
	}

}
