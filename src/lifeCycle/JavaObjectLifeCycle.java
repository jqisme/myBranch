package lifeCycle;

public class JavaObjectLifeCycle {
	/**
	 * 各个厂商的JVM实现也不尽相同，在这里，我们只针对sun的Hotspot虚拟机讨论，该虚拟机也是目前应用最广泛的虚拟机。
	 * 虚拟器规范中的7个内存区域分别是三个线程私有的和四个线程共享的内存区，
	 
	 * 线程私有的内存区域与线程具有相同的生命周期，
	 * 它们分别是： 指令计数器、 线程栈和本地线程栈，四个共享区是所有线程共享的，
	 
	 * 在JVM启动时就会分配，分别是：方法区、 常量池、直接内存区和堆（即我们通常所说的JVM的内存分为堆和栈中的堆，后者就是前面的线程栈）。
	 * @return
	 */
	
	public Object test(){
		Object obj = new Object();
	    return obj;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
