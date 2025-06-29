package entities;

public class util {
	
	public int id;
	public String name;
	public double salary;

    public util(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

	public void increaseSalary(double percentage) {
		if (percentage > 0) {
			this.salary += this.salary * percentage / 100;
		}
	}

	@Override
	public String toString() {
		return "ID: " 
		+ id + ", Name: " 
		+ name + ", Salary: $" 
		+ String.format("%.2f", salary);
	}
}

