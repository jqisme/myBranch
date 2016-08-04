package LearnStatic;

public class LearningStatic {
	public static int i = 10;//静态变量
	public int j = 1;
	
	public LearningStatic() {//构造方法
	}
	
	public static void funA(){
		i = 20;
//		j = 10;//编译出差
//		this.j = 10;//编译出差
	}
	
	public void funB(){
		i = 30;
		j = 10;
		this.j = 10;
	}
	
	public static void main(String[] args) {
		
//		System.out.println("======="+j+"=======");//编译出差
		/**很显然，被static关键字修饰的方法或者变量不需要依赖于对象来进行访问，只要类被加载了，就可以通过类名去进行访问。*/
		System.out.println("======="+i+"=======");//编译通过
		LearningStatic ls = new LearningStatic();
		System.out.println("======="+ls.j+"=======");
		System.out.println("======="+ls.i+"=======");
		funA();
//		funB();//编译出差
		ls.funB();
		
		ls = null;
		System.out.println("======="+ls.i+"=======");//ls.i跟i一样
//		System.out.println("======="+ls.j+"=======");//空指针异常
	}
}
