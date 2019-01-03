package gym;
import java.util.*;
public class Gym {
	private ArrayList<Training_Device> Machines;
	private ArrayList<Trainee> costumers;
	public ArrayList<Training_Device> getMachines() {
		return Machines;
	}
	public Gym(ArrayList<Training_Device> machines, ArrayList<Trainee> costumers) {
		Machines = machines;
		this.costumers = costumers;
	}
	public ArrayList<Trainee> getCostumers() {
		return costumers;
	}
	public void addTrainee(Trainee trn)
	{
		this.costumers.add(trn);
		
	}
	public void remTrainee(int index)
	{
		this.costumers.remove(index);
	}
}
