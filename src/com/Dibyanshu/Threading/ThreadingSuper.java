package com.Dibyanshu.Threading;

public class ThreadingSuper extends Thread{

	private int threadNumber;
	public ThreadingSuper(int threadNumber) {
		this.threadNumber=threadNumber;
	}
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+" from thread number : "+threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
