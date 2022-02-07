package net.calculator;

public class Main {

	public static void main(String[] args) {
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("c:\\Windows\\System32\\cmd.exe");
		try {
			builder.start();
			new Calculator();
		}catch(Exception e) {e.printStackTrace();}
	}

}
