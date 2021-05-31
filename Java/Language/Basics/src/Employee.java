package payroll; 

public class Employee {
	
	private int id;
	private int hours;
	private float rate;
	private static int count; //value will be shared by all instances

	//parameterized constructor
	public Employee(int h, float r) {
		id = 101 + count++;
		hours = h;
		rate = r;
	}

	//parameterless constructor
	public Employee() {
		this(0, 50); //calling above constructor
	}

	public int getId() { return id; }
	
	public int getHours() { return hours; }
	public void setHours(int value) { hours = value; }

	public float getRate() { return rate; }
	public void setRate(float value) { rate = value; }

	public double income() {
		double amount = hours * rate;
		int ot = hours - 180;
		if(ot > 0)
			amount += 50 * ot;
		return amount;
	}


}


