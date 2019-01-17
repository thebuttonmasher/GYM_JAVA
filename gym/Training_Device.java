package gym;

import java.util.ArrayList;

public class Training_Device {
	private String name;
	private String type;
	private String muscle;
	private float timeToWork;
	private ArrayList<Exercise> exList;
	public float getTimeToWork() {
		return timeToWork;
	}
	public void setTimeToWork(float timeToWork) {
		this.timeToWork = timeToWork;
	}
	public float getPulse() {
		return pulse;
	}
	public void setPulse(float pulse) {
		this.pulse = pulse;
	}


	private float pulse;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMuscle() {
		return muscle;
	}
	public void setMuscle(String muscle) {
		this.muscle = muscle;
	}
	public Training_Device(String name, String type, float timetowork, float pulse) {
		
		this.name = name;
		this.type = type;
		this.muscle = "";
		this.timeToWork = timetowork;
		this.pulse = pulse;
		this.exList = new ArrayList<Exercise>();
		

	}

	
	public Training_Device(String name, String type, String muscle) {
		super();
		this.name = name;
		this.type = type;
		this.muscle = muscle;
		this.timeToWork = 0;
		this.pulse = 0;
		this.exList = new ArrayList<Exercise>();
	}
	@Override
	public String toString() {
		return name;
	}
	public ArrayList<Exercise> getExList() {
		return exList;
	}
	public void setExList(ArrayList<Exercise> exList) {
		this.exList = exList;
	}
	
	
}
