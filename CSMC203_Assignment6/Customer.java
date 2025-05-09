
public class Customer {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c) {
		this.name = c.name;
		this.age = c.age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
}
