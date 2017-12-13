package ThreadTest;

/**
 * 实现Runnable接口实现多线程
 * @author liyu
 * 该方法适用于该类已经继承了一个其它的类，即非Thread类，就无法直接extends Thread，此时，必须实现一个Runnable接口
 */
public class MyThreadImplementsRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MyThreadImplementsRunnable());
		Thread thread2 = new Thread(new MyThreadImplementsRunnable());
		thread1.start();
		thread2.start();
	}

	@Override
	public void run() {
		// 编写自己线程的代码
		System.out.println("该线程是通过实现接口方式实现的");
	}

}
