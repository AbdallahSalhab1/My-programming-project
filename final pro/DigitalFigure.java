package thepro;

import java.util.Scanner;

public class DigitalFigure {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String binaryNum;
		  System.out.println("please enter the binary number ");
		binaryNum = scanner.next();
		
		int power = 1;
		int expo = 0;
		int base = 2;
		int decimal = 0;
		
		int i = binaryNum.length() - 1;  //gives us the length of the number - 1
		
		  while (i >= 0) {
			  if (binaryNum.charAt(i) == '1') {
				  for (int j = 0 ; expo > j ; j++) {
					  power *= base;
				  }
				  decimal += power;
				  power = 1;
			  }
			  i--;
			  expo++;
		  }
		  System.out.println("the decimal number is " + decimal);
		   
		
		  int count = 0;
		  int odecimal = decimal;
		  while (decimal > 0) {
			  decimal = decimal / 10;
			  count++;
		  }
		  
		  
		  int m = 1;
		  for (int r = 1 ; r <= count ; r++) {
			  m = m * 10;
		  }
		  for (int k = 1 ; k <= count ; k++) {
			 
			 int e = m / 10;		  
		  int l = odecimal % m;
		  l = (l - (odecimal % e)) / e;
		 
		  if (l == 0) {
			  System.out.println(" -");
			  System.out.println("| |");
			  System.out.println("| |");
			  System.out.println(" -");
		  }
		  
		if (l == 1) {
			System.out.println("  |");
			System.out.println("  |");
		}
		
		if (l == 2) {
			System.out.println(" -");
			System.out.println("  |");
			System.out.println(" -");
			System.out.println("|");
			System.out.println(" -");
		}
		
		if (l == 3) {
			System.out.println(" -");
			System.out.println("  |");
			System.out.println(" -");
			System.out.println("  |");
			System.out.println(" -");
		}
		
		if (l == 4) {
			System.out.println("| |");
			System.out.println(" - -");
			System.out.println("  |");
		}
		
		if (l == 5) {
			System.out.println(" -");
			System.out.println("|");
			System.out.println(" -");
			System.out.println("  |");
			System.out.println(" -");
		}
		
		if (l == 6) {
			System.out.println(" -");
			System.out.println("|");
			System.out.println(" -");
			System.out.println("| |");
			System.out.println(" -");
		}
		
		if (l == 7) {
			System.out.println(" -");
			System.out.println("  |");
			System.out.println("  |");
		}
		
		if (l == 8) {
			System.out.println(" -");
			System.out.println("| |");
			System.out.println(" -");
			System.out.println("| |");
			System.out.println(" -");
		}
		
		if (l == 9) {
			System.out.println(" -");
			System.out.println("| |");
			System.out.println(" -");
			System.out.println("  |");
			System.out.println(" -");
		}
		m = m / 10;
		System.out.println(" ");
		
		
		  }
		  
		  

		
	}

}