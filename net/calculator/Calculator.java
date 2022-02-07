package net.calculator;

import java.util.Scanner;

public class Calculator {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	@SuppressWarnings("static-access")
	public Calculator() throws Exception {
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("cmd.exe", "/c", "color 02");
		builder.start();
		Thread.sleep(1000);
		System.out.println("********************Java Calculator DOS mode********************");
		Thread.sleep(1000);
		System.out.println("Do + for addition");
		Thread.sleep(1000);
		System.out.println("Do - for subtraction");
		Thread.sleep(1000);
		System.out.println("Do * for multiplication");
		Thread.sleep(1000);
		System.out.println("Do / for divison");
		Thread.sleep(2000);
		System.out.println("*******************Select a mode********************");
		
		String choice = this.SCANNER.nextLine();
		
		System.out.println("You chose: "+choice);
		
		switch(choice) {
			case "+": this.add();
			break;
			case "-": this.subtract();
			break;
			case "*": this.multiply();
			break;
			case "/": this.divide();
			
		
		}
		
	}
	
	public void add() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Java addition calculator DOS mode********************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your first number!");
		String fnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your second number!");
		String snum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your third number or leave a zero");
		String tnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your fourth number or leave a zero");
		String fonum = this.SCANNER.nextLine();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Answer********************");
		System.out.println(Integer.parseInt(fnum)+Integer.parseInt(snum)+Integer.parseInt(tnum)+Integer.parseInt(fonum));
		System.out.println("**********************************************");
		System.out.println("Type restart to return to the main menu or end to close the program");
		String typed = this.SCANNER.nextLine();
		
		switch(typed) {
		case "restart": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "end": System.exit(0);
			break;
		case "": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
		
		
		
	}
	public void subtract() {
		System.out.println("********************Java subtraction calculator DOS mode********************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your first number!");
		String fnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your second number!");
		String snum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your third number or leave a zero");
		String tnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your fourth number or leave a zero");
		String fonum = this.SCANNER.nextLine();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Answer********************");
		System.out.println(Integer.parseInt(fnum)-Integer.parseInt(snum)-Integer.parseInt(tnum)-Integer.parseInt(fonum));
		System.out.println("**********************************************");
		System.out.println("Type restart to return to the main menu or end to close the program");
		String typed = this.SCANNER.nextLine();
		
		switch(typed) {
		case "restart": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "end": System.exit(0);
			break;
		case "": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
	}
	public void multiply() {
		System.out.println("********************Java multiplication calculator DOS mode********************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your first number!");
		String fnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your second number!");
		String snum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your third number or leave a zero");
		String tnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your fourth number or leave a zero");
		String fonum = this.SCANNER.nextLine();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Answer********************");
		System.out.println(Integer.parseInt(fnum)*Integer.parseInt(snum)*Integer.parseInt(tnum)*Integer.parseInt(fonum));
		System.out.println("**********************************************");
		System.out.println("Type restart to return to the main menu or end to close the program");
		String typed = this.SCANNER.nextLine();
		switch(typed) {
		case "restart": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "end": System.exit(0);
			break;
		case "": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		
		
	}
	public void divide() {
		System.out.println("********************Java divison calculator DOS mode********************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your first number!");
		String fnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your second number!");
		String snum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your third number or leave a zero");
		String tnum = this.SCANNER.nextLine();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your fourth number or leave a zero");
		String fonum = this.SCANNER.nextLine();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Answer********************");
		System.out.println(Integer.parseInt(fnum)/Integer.parseInt(snum)/Integer.parseInt(tnum)/Integer.parseInt(fonum));
		System.out.println("**********************************************");
		System.out.println("Type restart to return to the main menu or end to close the program");
		String typed = this.SCANNER.nextLine();
		switch(typed) {
		case "restart": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "end": System.exit(0);
			break;
		case "": try {
				new Calculator();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
}
