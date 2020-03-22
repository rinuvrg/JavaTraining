package strings;

class Student
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * @Override public String toString() { return
	 * "Name : "+this.getName()+" Age : "+this.getAge(); }
	 */
    
}


public class StringClass 
{
	public static void main(String arg[])
	{
		Student student=new Student();
		student.setName("Meenu");
		student.setAge(28);
		System.out.println("Studeent : "+student);
	}
}
