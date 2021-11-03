package CacThaoTacDoiTuong;

	import java.util.Scanner;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class XuatNhap {
		public static void main(String[] args) throws IOException {
			Scanner scanner = new Scanner(System.in);
			String data;
			System.out.println("Nhập vào chuỗi bất kỳ: ");
			data = scanner.nextLine();
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write(data);
			myWriter.close();
			System.out.println("Ghi thành công");
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data2 = myReader.nextLine();
				System.out.println("Đọc file filename.txt :");
				System.out.println(data2);
				 
			}
		}
	}
