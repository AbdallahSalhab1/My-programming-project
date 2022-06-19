package examplesPro;

import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the number of the number of the month that you want to know the number of days in it ");
		month = scan.nextInt();
		System.out.println("Number of days in this month = " + numOfDays(month) + "days");
		

	}
	
	private static int numOfDays(int month) {
		int days;
		switch (month) {
		case 1: {
			
			days = 31;
			
		}
		break;
		case 2: {
			days = 28;
		}
		break;
		case 3: {
			days = 31;
		}
		break;
		case 4: {
			days = 30;
		}
		break;
		case 5: {
			days = 31;
		}
		break;
		case 6: {
			days = 30;
		}
		break;
		case 7: {
			days = 31;
		}
		break;
		case 8: {
			days = 31;
		}
		break;
		case 9: {
			days = 30;
		}
		break;
		case 10: {
			days = 31;
		}
		break;
		case 11: {
			days = 30;
		}
		break;
		case 12: {
			days = 31;
		}
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
		return days;
		
	}

}
