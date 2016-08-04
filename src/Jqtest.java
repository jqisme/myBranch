import java.io.StringReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;




public class Jqtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func2();
	}
	
	public static void func1(){
		int[] a = {1,2,3,4};
		int[] b = new int[5];
		//将数组a中，下标为1开始复制到b下标为3开始2位
		System.arraycopy(a, 1, b, 3, 2);// b = {0, 0, 0, 2, 3}
		System.out.println(Arrays.toString(b));
	}
	
	public static void func2(){
		double d = 1234567890;
		System.out.println(d);//1.23456789E8
		String str = "double:"+d;
		System.out.println(str);
	}
	

}
