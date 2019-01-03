package gym;

public class Exercise {
	
	private String name;
	private String type;
	private float timeToWork;
	private float pulse;
	private int id;
	private int sets;
	private int reps;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Exercise(String name, int id, int sets, int reps) {

		this.name = name;
		this.id = id;
		this.sets = sets;
		this.reps = reps;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public Exercise(String name, String type, float timeToWork, float pulse,
			int id) {
		super();
		this.name = name;
		this.type = type;
		this.timeToWork = timeToWork;
		this.pulse = pulse;
		this.id = id;
	}
	public int getSets() {
		return sets;
	}
	public void setSets(int sets) {
		this.sets = sets;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
}
