package epam.task_3;

import java.util.Scanner;

public class InterestCalculator {
	private Scanner inputScannerObject;

	InterestCalculator(){
		inputScannerObject = new Scanner(System.in);
		int initialPrincipalAmount=inputScannerObject.nextInt();
		float annualInterestRate=inputScannerObject.nextFloat();
		int time=inputScannerObject.nextInt();
		int numberOfPeriodsElapsed=inputScannerObject.nextInt();
		new SimpleInterestCalculator(initialPrincipalAmount,annualInterestRate,time);
		new CompoundInterestCalculator(initialPrincipalAmount,annualInterestRate,time,numberOfPeriodsElapsed);
	}
}
