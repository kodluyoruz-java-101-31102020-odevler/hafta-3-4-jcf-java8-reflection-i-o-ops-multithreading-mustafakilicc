package solution3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		System.out.print("��renci Numaran�z� Giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.next();
		System.out.print("Ad�n�z: ");
		String studentName = scanner.next();
		System.out.print("Soyad�n�z: ");
		String studentSurname = scanner.next();
		System.out.print("Ya��n�z: ");
		String studentAge = scanner.next();
		System.out.print("B�l�m�n�z: ");
		String studentDepartment = scanner.next();
		
		Map<String,Student> studentMap= new HashMap<String,Student >();
		studentMap.put(studentNo, new Student(studentName,studentSurname,Integer.parseInt(studentAge),Integer.parseInt(studentNo),studentDepartment));
		System.out.println(studentMap);
	}

}
