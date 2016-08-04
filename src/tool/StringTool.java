package tool;

public class StringTool {
	public static void main(String[] args) {
		String str = dltLastChar(new StringBuffer("abcdefg"));
		str = dltLastChar("abcdefg");
		System.out.println(str);
	}
	/**
	 * StringBuffer删除最后一个字符的方法
	 * @param sb
	 * @return
	 */
	public static String dltLastChar(StringBuffer sb){
		sb.deleteCharAt(sb.length()-1);  
		return sb.toString();
	}
	
	/**
	 * String删除最后一个字符的方法
	 * @param str
	 * @return
	 */
	public static String dltLastChar(String str){
		return str.substring(0, str.length()-1);
	}
}
