package abdallah;

public class demo {

	
import employee.*;
import salaryCalculator.Basicsalary;

	
	public static void main(String[] args) {
		
	
		int salary1, salary2 = 0;
		
		fulltime emp1 = new fulltime();
		
		emp1.setHour(10);
		
		Basicsalary emp1salary = new Basicsalary();
		
		salary1 = emp1salary.calculatesalary(emp1.getHour(), emp1.getRate());
		
		System.out.println("first salary " + salary1);
		
		salary1 = emp1salary.calculatesalary(emp1.getHour(), emp1.getRate(), true, 5);
		
		System.out.println("first salary " + salary1);
		
		parttime emp2 = new parttime();
		
		emp2.setHour(4);
		
		Basicsalary emp2salary = new Basicsalary();
		
		salary2 = emp2salary.calculatesalary(emp2.getHour(), emp2.getRate());
		
		System.out.println("first salary " + salary2);
		
		salary1 = emp1salary.calculatesalary(emp2.getHour(), emp2.getRate(), true, 5);
		
		System.out.println("first salary " + salary2);
		
	}
	



