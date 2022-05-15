package salaryCalculator;

public class Basicsalary {
	
	public int calculatesalary(int _hour, int _rate) {
		return _hour * _rate;
	}
	
	public int calculatesalary(int _hour, int _rate, boolean _overtime, int overtimecount) {
		
		int salary = calculatesalary(_hour, _rate);
		
		if(_overtime) {
		
			return overtimesalary.calculateovertimesalary(salary, overtimecount);
		}
		return salary;
	}

}
