package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	private List<Employee> emp = new ArrayList<>();
	private Address address;
	
	public Department() {
	}
	
	public Department(String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public List<Employee> getEmployee(){
		return emp;
	}
	
	public void addEmployee(Employee employee) {
		emp.add(employee);
	}
	public void removeEmployee(Employee employee) {
		emp.remove(employee);
	}
	
	public double payRoll() {
		double sum = 0;
		for(Employee e : this.emp) {
			sum += e.getSalary();
		}
		return sum;
	}
}
