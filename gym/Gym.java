package gym;
import java.util.*;
public class Gym {
	private ArrayList<Training_Device> Machines = new ArrayList<Training_Device>();
	private ArrayList<Trainee> costumers= new ArrayList<Trainee>();
	public ArrayList<Training_Device> getMachines() {
		return Machines;
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
