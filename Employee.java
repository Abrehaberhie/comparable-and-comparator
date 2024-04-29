package comparableVscomparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	int id;
	String name;
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
public static Comparator<Employee> custumuzingComparing =new Comparator<Employee>()
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
};
}
