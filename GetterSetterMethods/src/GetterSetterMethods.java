public class GetterSetterMethods {	
	public static void main (String[] args) {				
		Student student = new Student();
		student.setName("Christian");
		student.setMatrikelNumber(325625);
		student.setUniversity("Hochschule Anhalt");
		
		System.out.println(student.getName());
		System.out.println(student.getMatrikelNumber());
		System.out.println(student.toString());
	}

}
