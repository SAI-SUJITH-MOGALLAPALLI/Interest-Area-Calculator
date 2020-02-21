package epam.task_3;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SimpleInterestCalculator {
	private PrintStream myout;
	SimpleInterestCalculator(int initialPrincipalAmount,float annualInterestRate,int time){
		myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		float finalAmount=(float)initialPrincipalAmount*(1+(annualInterestRate*(float)time));
		myout.print("Simple Interest:"+finalAmount);
	}
}
