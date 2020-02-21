package epam.task_3;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConstructionCostCalculator {
	private PrintStream myout;
	private Scanner inputScannerObject;
	ConstructionCostCalculator(){
		myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("1.Standard Material\n");
		myout.print("2:Above standard Material\n");
		myout.print("3:High Standard Material");
		inputScannerObject = new Scanner(System.in);
		int standardMaterial=inputScannerObject.nextInt();
		new CostCalculatorOfConstruction(standardMaterial);
	}
}
