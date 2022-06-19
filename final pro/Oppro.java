package examplesPro;

import java.util.Scanner;

public class Oppro {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int id;
	

	 Student std1 = new Student();
	 std1.setAge(15);
	 std1.setName("ahmad");
	 std1.setGoodStudent(true);
	 std1.setId(2001);
	 
	 Student std2 = new Student();
	 std2.setAge(17);
	 std2.setName("emad");
	 std2.setGoodStudent(false);
	 std2.setId(2003);
	 
	 Student std3 = new Student();
	 std3.setAge(18);
	 std3.setName("leen");
	 std3.setGoodStudent(true);
	 std3.setId(2004);
	 
	 Teacher tea1 = new Teacher();
	 tea1.setId(101);
	 tea1.setSubject("math");
	 tea1.setClassNum(5);
	 tea1.setName("khalel");
	 tea1.setSalary(350);
	 
	 Teacher tea2 = new Teacher();
	 tea2.setId(102);
	 tea2.setSubject("science");
	 tea2.setClassNum(4);
	 tea2.setName("hamed");
	 tea2.setSalary(380);
	 
	 Teacher tea3 = new Teacher();
	 tea3.setId(103);
	 tea3.setSubject("chemistry");
	 tea3.setClassNum(6);
	 tea3.setName("mohammad");
	 tea3.setSalary(340);
	 
	 Principals pri1 = new Principals();
	 pri1.setId(10);
	 pri1.setDepartment("IT");
	 pri1.setName("ramy");
	
	System.out.println("hello can you enter your ID =)");
	
		id = scan.nextInt();
		
		
		if( id < 11) {
			System.out.println("the school principals informations are:");
			System.out.println("ID: " + pri1.getId());
			System.out.println("deprtment: " + pri1.getDepartment());
			System.out.println("name: " + pri1.getName());
			System.out.println("salary: " + pri1.getSalary());
		}
		
		if ((id >= 11) && (id < 200) ) {
			System.out.println("the school Teachers informations are:");
			System.out.println("ID: " + tea1.getId());
			System.out.println("name: " + tea1.getName());
			System.out.println("salary: "  + tea1.getSalary());
			System.out.println("subject: " + tea1.getSubject());
			System.out.println("class num: " + tea1.getClassNum());
			System.out.println("-----------------------------------------------------");
			System.out.println("ID: " + tea2.getId());
			System.out.println("name: " + tea2.getName());
			System.out.println("salary: " + tea2.getSalary());
			System.out.println("subject: " + tea2.getSubject());
			System.out.println("class num: " + tea2.getClassNum());
			System.out.println("-----------------------------------------------------");
			System.out.println("ID: " + tea3.getId());
			System.out.println("name: " + tea3.getName());
			System.out.println("salary: " + tea3.getSalary());
			System.out.println("subject: " + tea3.getSubject());
			System.out.println("class num: " + tea3.getClassNum());
		}
		
		if (id > 200) {
			System.out.println("the school students informations are:");	
			System.out.println("ID: " + std1.getId());
			System.out.println("name: " + std1.getName());
			System.out.println("age: " + std1.getAge());
			System.out.println("good: " + std1.getGoodStudent());
			System.out.println("-----------------------------------------------------");
			System.out.println("ID: " + std2.getId());
			System.out.println("name: " + std2.getName());
			System.out.println("age: " + std2.getAge());
			System.out.println("good: " + std2.getGoodStudent());
			System.out.println("-----------------------------------------------------");
			System.out.println("ID: " + std3.getId());
			System.out.println("name: " + std3.getName());
			System.out.println("age: " + std3.getAge());
			System.out.println("good: " + std3.getGoodStudent());
			
		}
		
		
       
       

		
		

	}

}
