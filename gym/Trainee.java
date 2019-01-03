package gym;

public class Trainee {
	private String name;
	private int id;
	private String address;
	private int level;
	private Training_Regiment tr;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Trainee(String name, int id, String address, int level,
			Training_Regiment tr) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.level = level;
		this.tr = tr;
	}
	public Training_Regiment getTr() {
		return tr;
	}
	public void setTr(Training_Regiment tr) {
		this.tr = tr;
	}
	
	
}
