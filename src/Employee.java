
public class Employee implements Cloneable{
	public String name;
	public int balance;
	public int salary;
	
	public Employee() {
		this.balance = 0;
		this.salary = 5000;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

//	public String toString(){
//		return null != this.name ? this.name : "null";
//	}
	
}
