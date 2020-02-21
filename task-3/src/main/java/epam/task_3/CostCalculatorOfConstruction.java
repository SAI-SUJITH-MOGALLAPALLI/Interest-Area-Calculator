package epam.task_3;

public class CostCalculatorOfConstruction {

	public CostCalculatorOfConstruction(int standardMaterial) {
		if(standardMaterial==1)
			new FinalCost(1200);
		else if(standardMaterial==2)
			new FinalCost(1500);
		else if(standardMaterial==3)
			new FinalCost(1800);
	}

}
