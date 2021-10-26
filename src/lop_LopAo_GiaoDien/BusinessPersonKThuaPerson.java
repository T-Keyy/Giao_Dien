package lop_LopAo_GiaoDien;

	import java.util.Scanner;
	import lop_LopAo_GiaoDien.GiaoDienTax.payTax;
	public class BusinessPersonKThuaPerson extends lopAoPerson implements payTax {
		// Thuoc tinh
		protected static String name,email;
		protected static int citizenID,phone;
		protected static double salary,business_income,other_income;
	    
	    // Ham khoi tao co doi so
	public BusinessPersonKThuaPerson(String name, int citizenID,
				int phone, String email, Double salary, Double business_income, Double other_income) {
			
			super(birthday, gender, blood_type);
			this.name = name;
			this.citizenID = citizenID;
			this.phone = phone;
	        this.email = email;
	        this.salary = salary;
	        this.business_income = business_income;
	        this.other_income = other_income;
		}

		// getter cho name
	    public String getName() {
	        return name;
	    }

	    // getter cho citizenID
	    public int getCitizenID() {
	        return citizenID;
	    }
	    
	    // getter cho phone
	    public int getPhone() {
	        return phone;
	    } 
	    
	    // getter cho email
	    public String getEmail() {
	        return email;
	    }
	    
	    // getter cho salary
	    public Double getSalary() {
	        return salary;
	    }
	    
	    // getter cho business_income
	    public Double getBusiness_income() {
	        return business_income;
	    }
	    
	    // getter cho other_income
	    public Double getOther_income() {
	        return other_income;
	    }
	    
	    // setter cho name
	    public void setName(String name) {
			this.name = name;
		}
	    
	    // setter cho citizenID
	    public void setCitizenID(int citizenID) {
			this.citizenID = citizenID;
		}
	    
	    // setter cho phone
	    public void setPhone(int phone) {
			this.phone = phone;
	    }	

	    // setter cho email
	    public void setEmail(String email) {
			this.email = email;
		}
	    
	    // setter cho salary
	    public void setSalary(Double salary) {
			this.salary = salary;
		}
	    
	    // setter cho business_income
	    public void setBusiness_income(Double business_income) {
			this.business_income = business_income;
		}
	    
	    // setter cho other_income
	    public void setOther_income(Double other_income) {
			this.other_income = other_income;
		}

	 // Ham hien thi
	    public void display() {
	        super.display();
	        System.out.println("\tHo Ten: " + name);
	        System.out.println("\tID CMND: " + citizenID);
	        System.out.println("\tPhone: " + phone);
	        System.out.println("\tEmail: " + email);
	        System.out.println("\tTien Luong: " + salary);
	        System.out.println("\tTien Thu Nhap Doang Nghiep: " + business_income);
	        System.out.println("\tTien Thu Nhap Khac: " + other_income);
	    }

	    // Ham nhap thong tin
	    public void enter() {
	    	Scanner sc = new Scanner(System.in);
	        super.enter();
	        System.out.print("\tNhap Ho Ten: ");
	        name = sc.next();
	        System.out.print("\tNhap ID CMND: ");
	        citizenID = sc.nextInt();
	        System.out.print("\tNhap Phone: ");
	        phone = sc.nextInt();    
	        System.out.print("\tNhap Email: ");
	        email = sc.next();
	        System.out.print("\tNhap Tien Luong: ");
	        salary = sc.nextDouble();
	        System.out.print("\tNhap Tien Thu Nhap Doang Nghiep: ");
	        business_income = sc.nextDouble();
	        System.out.print("\tNhap Tien Thu Nhap Khac: ");
	        other_income = sc.nextDouble();
	    }
	    public static void main(String[] args) {
	  		// TODO Auto-generated method stub
	    	BusinessPersonKThuaPerson P = new BusinessPersonKThuaPerson(name, citizenID, phone, email, salary, business_income, other_income);
	    	P.enter();
	    	P.display();
	  	}

		@Override
		public double calcTax(double income, int start_time, int end_time) {
			// TODO Auto-generated method stub
			return 0;
		}
	}