package lop_LopAo_GiaoDien;

import java.util.Scanner;

class lopAoPerson{
	protected static int birthday;
	protected static String gender;
	protected static String blood_type;

	public lopAoPerson(int birthday, String gender, String blood_type) {
		this.birthday = birthday;
		this.gender = gender;
		this.blood_type = blood_type;
	}

	// getter cho birthday
	public int getBirthday() {
		return birthday;
	}

	// setter cho birthday
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	// getter cho gender
	public String getGender() {
		return gender;
	}

	// setter cho gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	// getter cho blood_type
	public String getBlood_type() {
		return blood_type;
	}

	// setter cho blood_type
	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	// hien thi thong tin
	public void display() {
		System.out.println("\tNgay Sinh " + birthday);
		System.out.println("\tGioi Tinh: " + gender);
		System.out.println("\tNhom Mau: " + blood_type);
	}

	// Ham nhap thong tin
	public void enter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNgay Sinh: ");
		birthday = sc.nextInt();
		System.out.print("\tGioi Tinh: ");
		gender = sc.next();
		System.out.print("\tNhom Mau: ");
		blood_type = sc.next();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lopAoPerson P = new lopAoPerson(birthday, gender, blood_type);
		P.enter();
		P.display();
	}
}