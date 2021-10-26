package lop_LopAo_GiaoDien;

import java.util.Scanner;
import lop_LopAo_GiaoDien.GiaoDienTax.payTax;

public class KeThuaLAoPerson extends lopAoPerson implements payTax {
	// Thuoc tinh
	protected static String name,email;
	protected static int studentID;
	protected static int phone;

    // Ham khoi tao co doi so
    public KeThuaLAoPerson(String name,int studentID,int phone, String email) {
    	super(birthday, gender, blood_type);
		this.name = name;
		this.studentID = studentID;
		this.phone = phone;
        this.email = email;
	}
    // getter cho name
    public String getName() {
        return name;
    }

    // getter cho studentID
    public int getStudentID() {
        return studentID;
    }
    
    // getter cho email
    public String getEmail() {
        return email;
    }
    
    // getter cho phone
    public int getPhone() {
        return phone;
    } 
    
    // setter cho name
    public void setName(String name) {
		this.name = name;
	}
    
    // setter cho StudentID
    public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
    
    // setter cho email
    public void setEmail(String email) {
		this.email = email;
	}
    
    // setter cho phone
    public void setPhone(int phone) {
		this.phone = phone;
	}
 // Ham hien thi
    public void display() {
        super.display();
        System.out.println("\tHo Ten: " + name);
        System.out.println("\tID Hoc Sinh: " + studentID);
        System.out.println("\tPhone: " + phone);
        System.out.println("\tEmail: " + email);
    }

    // Ham nhap thong tin
    public void enter() {
    	Scanner sc = new Scanner(System.in);
        super.enter();
        System.out.print("\tNhap Ho Ten: ");
        name = sc.next();
        System.out.print("\tNhap ID Hoc Sinh: ");
        studentID = sc.nextInt();
        System.out.print("\tNhap Phone: ");
        phone = sc.nextInt();   
        System.out.print("\tNhap Email: ");
        email = sc.next(); 
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	KeThuaLAoPerson P = new KeThuaLAoPerson(name, studentID, phone,email);
    	P.enter();
    	P.display();
  	}
	@Override
	public double calcTax(double income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		return 0;
	}
}
