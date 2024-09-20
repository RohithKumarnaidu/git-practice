package encapsulation;

public class StudentData {

	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setId(21);
		st.setName("Rohith");
		
		System.out.println(st.getId() + " | " + st.getName());
		

	}

}
