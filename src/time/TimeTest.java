package time;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTest {
	public static void main(String[] args) {
		func1();
	}

	public static void func1(){
		TimeTest tt = new TimeTest();
		MyTimerTask task = tt.new MyTimerTask();
		Timer t = new Timer("timer1");
		System.out.println("当前时间："+System.currentTimeMillis());
		t.schedule(task, 0,100);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.cancel();
	}
	//timerTask   
	class MyTimerTask extends TimerTask{
		int counter=0;
		@Override
		public void run() {
			counter++;
			System.out.println("第" + counter +"次" + "---当前时间："+System.currentTimeMillis());
		}
	}
}
