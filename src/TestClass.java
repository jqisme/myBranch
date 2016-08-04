
public class TestClass {
	public int i;
	public Object obj;
	
	public static void main(String[] args){
		fun2();
		
		
		
	}
	//obj.toString的组成
	public static void fun1(){
		TestClass tc = new TestClass();
		Object obj = tc.obj = new Object();
		
		String str = obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
		System.out.println(str);
		System.out.println(obj.toString());
	}
	
	//clone
	public static void fun2(){
		Employee emp = new Employee();
		emp.setName("tom");
		//与emp共用内存中同一个obj
		Employee emp2 =emp;
		emp2.setName("jerry");
		System.out.println("emp:"+emp.toString());
		System.out.println("emp2:"+emp2.toString());
		
		
		Employee emp3 = new Employee();
		System.out.println("emp3:"+emp3.toString());
		emp3 = emp;
		//与emp共用内存中同一个obj
		System.out.println("emp3:"+emp3.toString());
		emp3.setName("demon");
		
		
		//clone
		Employee emp4 = new Employee();
		System.out.println("emp4:"+emp4.toString());
		try {
			emp4 = (Employee) emp.clone();
			emp4.setName("doli");
			System.out.println("emp4:"+emp4.toString());
			System.out.println("emp:"+emp.getName());
			System.out.println("emp4:"+emp4.getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
