package gym;

import java.util.ArrayList;

public class Training_Regiment {
	private String last_modified;
	private ArrayList<Exercise> exer;
	public String getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}
	public ArrayList<Exercise> getExer() {
		return exer;
	}
	public void setExer(ArrayList<Exercise> exer) {
		this.exer = exer;
	}
	public Training_Regiment(String last_modified, ArrayList<Exercise> exer) {
		
		this.last_modified = last_modified;
		this.exer = exer;
	}
	
}
