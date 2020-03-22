package extras;

class Employee
{
	private int id=0;
	private String name=null;
	private String department=null;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}


public class ObjectClassExperiment {

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.setId(100);
		emp.setDepartment("CSE");
		emp.setName("Ram Kumar");
		
		Object o=emp;
		
		System.out.println("Data "+o.toString());
		
		
		
	}

}
