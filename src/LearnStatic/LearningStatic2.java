package LearnStatic;

public class LearningStatic2 {
	public static void main(String[] args) {
		System.out.println("======="+LearningStatic.i+"=======");
		LearningStatic ls;
		//需要new
//		ls.j = 10;//编译不通过 The local variable ls may not have been initialized
		ls = new LearningStatic();
		ls.j = 10;//编译通过
	}
}
