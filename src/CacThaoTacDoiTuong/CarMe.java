package CacThaoTacDoiTuong;

import java.io.*;
import CacThaoTacDoiTuong.Student;
public class CarMe {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Car c = new Car("SH", "Bugi", 2, "22-10-2002");
		
		//Seriable
		//
		FileOutputStream fos = new FileOutputStream("D:\\filename.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("D:\\filename.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Car b = (Car)ois.readObject(); 
	    // down-casting object
	    System.out.print(b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	}

}