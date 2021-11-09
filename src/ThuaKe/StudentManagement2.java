package ThuaKe;


	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.Vector;

	public class StudentManagement2 {

		private ArrayList<Student2> studentList = new ArrayList<>();
		
		public StudentManagement2() {
			
		}
		
		public ArrayList<Student2> getStudentList() {
			return studentList;
		}

		public void setStudentList(ArrayList<Student2> studentList) {
			this.studentList = studentList;
		}

		@Override
		public String toString() {
			return "StudentManagement_Bai1 [studentList=" + studentList + ", getStudentList()=" + getStudentList() + "]";
		}
		
		 void input(int n) {
			for (int i=0; i<n; i++) {
				System.out.println("Nhập thông tin học sinh: " + (i+1) + ": ");
				Student2 s = new Student2();
				s.inputStudent();
				getStudentList().add(s);
			}
		}
		
		 void output(int n) {
			input(n);
			for (int i=0; i<getStudentList().size(); i++) {
				System.out.println("\n ========== " + getStudentList().get(i).getStudentID() + " ==========");
				getStudentList().get(i).outputStudent();
			}
		}
		
		void findBirthYear(int year) {
			Vector<Object> studentVector = new Vector<>();
			for (int i=0; i<getStudentList().size(); i++) {
				if(getStudentList().get(i).getBirth_year() == year) {
					studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
					studentVector.add("Tên: " + getStudentList().get(i).getName());
					studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
					studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
					studentVector.add("Năm nhập học: " + getStudentList().get(i).getAcademic_year() + "\n");
				}
			}
			System.out.println("\r\n" + "Sinh viên có năm sinh là: " + year + ": " + studentVector);
		}
		
		void findName(String name) {
			Vector<Object> studentVector = new Vector<>();
			for (int i=0; i<getStudentList().size(); i++) {
				if(getStudentList().get(i).getName().equals(name)) {
					studentVector.add("\n Mã: " + getStudentList().get(i).getStudentID());
					studentVector.add("Tên: " + getStudentList().get(i).getName());
					studentVector.add("Giới tính: " + getStudentList().get(i).getGender());
					studentVector.add("Năm sinh: " + getStudentList().get(i).getBirth_year());
					studentVector.add("Năm nhập học: " + getStudentList().get(i).getAcademic_year() + "\n");
				}
			}
			System.out.println("Học sinh có tên là: " + name + ": " + studentVector);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentManagement2 sm = new StudentManagement2();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhập số lượng học sinh = ");
			int n = scanner.nextInt();
			sm.output(n);
			System.out.print("Nhập năm = ");
			int year = scanner.nextInt();
			sm.findBirthYear(year);
			scanner.nextLine();
			System.out.print("Nhập tên = ");
			String name = scanner.nextLine();
			sm.findName(name);
			scanner.close();
		}

	}