package solution3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.print("Öðrenci Numaranýzý Giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.next();
		System.out.print("Adýnýz: ");
		String studentName = scanner.next();
		System.out.print("Soyadýnýz: ");
		String studentSurname = scanner.next();
		System.out.print("Yaþýnýz: ");
		String studentAge = scanner.next();
		System.out.print("Bölümünüz: ");
		String studentDepartment = scanner.next();
		
		Map<String,Student> studentMap= new HashMap<String,Student >();
		studentMap.put(studentNo, new Student(studentName,studentSurname,Integer.parseInt(studentAge),Integer.parseInt(studentNo),studentDepartment));
		System.out.println(studentMap);
	}

}
