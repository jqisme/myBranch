package IOexp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
	
	public static void main(String[] args) {
		fun();
	}
	
	public static void fun(){
		File file = new File("E://esb//ESBClient_new//MSG//BPM//新建文本文档.txt");
		FileInputStream is = null;
		String body = "";
		// 读取文件流
		byte[] request = null;
		try {
			is = new FileInputStream(file);
			request = new byte[is.available()];
			is.read(request);
			String str = new String(request, "GBK");
			byte[] msg = str.getBytes("UTF-8");
			request = new String(request,"UTF-8").getBytes("GBK");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
