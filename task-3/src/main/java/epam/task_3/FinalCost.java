package epam.task_3;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FinalCost {
	private PrintStream myout;
	private Scanner inputScannerObject;
	public FinalCost(int costDueToStandards) {
		myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		inputScannerObject = new Scanner(System.in);
		int areaOfHouse=inputScannerObject.nextInt();
		myout.print("If you want a Fully Automated Home or not (Yes/No):");
		String choiceOfYourFullyAutomatedHome=inputScannerObject.next();
		if(choiceOfYourFullyAutomatedHome.equalsIgnoreCase("yes")) {
			myout.print(areaOfHouse*2500);
		}
		else
			myout.print(areaOfHouse*costDueToStandards);
	}
	
}
