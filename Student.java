package ranking.org;

public class Student {
		int roll;
		String name;
		int marks;
		String department;
		
		public Student(int roll, String name, int marks,String department) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.department=department;
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + " ,department=" +department+" ]";
		}
}
