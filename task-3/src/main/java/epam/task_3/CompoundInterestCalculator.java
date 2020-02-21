package epam.task_3;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CompoundInterestCalculator {
	private PrintStream myout;
	public CompoundInterestCalculator(int initialPrincipalAmount, float annualInterestRate, int time,
			int numberOfPeriodsElapsed) {
		myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		float finalAmount=(float)initialPrincipalAmount*(1+(annualInterestRate/(float)numberOfPeriodsElapsed))*(numberOfPeriodsElapsed*time);
		myout.print("Compound Interest:"+finalAmount);
	}

}
