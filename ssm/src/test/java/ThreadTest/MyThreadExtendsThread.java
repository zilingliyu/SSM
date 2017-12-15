package ThreadTest;

/**
 * 继承Thread类实现多线程
 * @author liyu
 * Thread本质上也是实现了Runnable接口的一个实例，它代表一个线程的实例，并且启动线程的唯一方法就是通过Thread类的start()
 * 实例方法。start()方法是一个native方法(java调用非Java代码的接口，一个native方法是这样的一个Java方法：该方法的实现有非Java语言实现，
 * 	比如C。这个特性非Java所特有，很多其他的编程语言都有这一机制，比如C++)，它将启动一个新线程，并执行run()方法。
 */
public class MyThreadExtendsThread extends Thread{
	
	public void run(){
		//编写自己线程的代码
		//在线程执行start方法的时候就会调用该run方法
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyThreadExtendsThread myThread1 = new MyThreadExtendsThread();
		MyThreadExtendsThread myThread2 = new MyThreadExtendsThread();
		myThread1.setName("我是自定义的进程1");
		myThread2.setName("我是自定义线程2");
		myThread1.start();
		myThread2.start();
		System.out.println(Thread.currentThread().toString());
		
	}
}
