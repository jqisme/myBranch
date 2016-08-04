package thread;

import java.io.IOException;
import java.util.Timer;
/**
 * 线程，锁，sleep
 * @author jiangqi
 *
 */
public class ThreadTest {
    
    private int i = 10;
    private Object lock = new Object();
     
    public static void main(String[] args) throws IOException {
    	//sleep 期间不释放锁
    	test1();
    	test2();
    	
    	//sleep()指重新争夺cup sleep(10) 10内不争夺cpu
    	
    }
    
    //当线程只剩下守护线程的时候，JVM就会退出.但是如果还有其他的任意一个用户线程还在，JVM就不会退出.
    //sleep 期间不释放锁
    public static void test1(){
    	ThreadTest test = new ThreadTest();
    	System.out.println(test.lock);
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    }
    
    public static void test2(){
    	ThreadTest test = new ThreadTest();
    	System.out.println(test.lock);
        MyThread2 thread1 = test.new MyThread2();
        MyThread2 thread2 = test.new MyThread2();
        thread1.start();
        thread2.start();
    }
    
    class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (lock) {
                i++;
                System.out.println("i:"+i);
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:"+i);
            }
        }
    }
    class MyThread2 extends Thread{
        @Override
        public void run() {
            i++;
            System.out.println("i:"+i);
            try {
                System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
            i++;
            System.out.println("i:"+i);
        }
    }
}
