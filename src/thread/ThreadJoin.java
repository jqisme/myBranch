package thread;

public class ThreadJoin implements Runnable{
	
	 public static int a = 0;  
	
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin t = new ThreadJoin();
//		new Thread(t).start();
//		System.out.println(a);//a很难=5
		
		Thread t1 = new Thread(t);
		t1.start();
		//当main线程调用t.join时候，main线程会获得线程对象t的锁（wait 意味着拿到该对象的锁),
		//调用该对象的wait(等待时间)，直到该对象唤醒main线程 ，比如退出后
		t1.join();
		System.out.println(a);//a=5
		
	}
	
	@Override
	public void run() {
		for (int k = 0; k < 5; k++) {  
            a = a + 1;  
        }
	}
}
